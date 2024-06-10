import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int l, desx, desy;
    static int[][] chess;
    static boolean[][] visited;

    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(t>0){
            l = Integer.parseInt(br.readLine());
            chess = new int[l][l];
            visited = new boolean[l][l];
            st = new StringTokenizer(br.readLine());
            int curx = Integer.parseInt(st.nextToken());
            int cury = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            desx = Integer.parseInt(st.nextToken());
            desy = Integer.parseInt(st.nextToken());
            sb.append(bfs(curx, cury)).append("\n");
            t--;
        }
        System.out.println(sb);
        br.close();
    }

    static int bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        chess[x][y]++;
        visited[x][y] = true;
        int result = 0;

        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int i=0; i<dx.length; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                //chess 범위 밖이거나 방문한 곳이면 skip
                if(nx<0 ||nx>=l ||ny<0 ||ny>=l || visited[nx][ny]) continue;
                if(nx==desx && ny==desy){
                    return chess[cur.x][cur.y];
                }
                q.offer(new Point(nx, ny));
                chess[nx][ny] = chess[cur.x][cur.y]+1;
                visited[nx][ny] = true;
            }
        }
        return result;
    }
}

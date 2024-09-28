import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0, 1, -1, -1, 1}; //대각선까지
    static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
    static int[][] graph;
    static boolean[][] visited;
    static int w, h;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){ 
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0 && h==0){//0 0 입력되면 종료
                break;
            }
            graph = new int[h][w];
            visited = new boolean[h][w];
            int count = 0;
            for(int i=0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i=0; i<graph.length; i++){
                for(int j=0; j<graph[i].length; j++){
                    if(graph[i][j]==1 && !visited[i][j]){
                        visited[i][j] = true;
                        bfs(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<8; i++){
                int nx = cur[0]+dx[i];
                int ny = cur[1]+dy[i];

                if(nx<0 || nx>=h || ny<0 || ny>=w) continue;
                if(graph[nx][ny] == 0 || visited[nx][ny]) continue;
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}

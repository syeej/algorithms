import java.io.*;
import java.nio.Buffer;
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
    static int n, count, size;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] strArr = br.readLine().split("");
            for(int j=0; j<n; j++){
                graph[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(graph[i][j]==1 && !visited[i][j]){
                    list.add(bfs(i, j));
                }
            }
        }
        Collections.sort(list);

        br.close();
        System.out.println(count);
        for(int num: list){
            System.out.println(num);
        }
    }
    public static int bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int size = 1;

        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                //범위 밖 skip
                if(nx<0||nx>=n||ny<0||ny>=n) continue;
                //이미 방문했거나 0이면 skip
                if(visited[nx][ny] || graph[nx][ny]==0) continue;

                q.offer(new Point(nx, ny));
                visited[nx][ny] = true;
                size++;
            }
        }
        count++;
        return size;
    }
}

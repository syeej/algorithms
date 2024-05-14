import java.io.*;
import java.util.*;

public class Main {
    static int n, count;
    static Character[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        graph = new Character[n][n];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                graph[i][j] = str.charAt(j);
            }
        }
        //탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){
                    bfs(i, j);
                    count++;
                }
                //녹색-> 적색
                if(graph[i][j] == 'G')
                    graph[i][j] = 'R';

            }
        }
        sb.append(count);
        //적록색약 탐색
        count = 0;
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        sb.append(" "+count);
        br.close();
        System.out.println(sb.toString());
    }
    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q. offer(new int[]{x, y});
        visited[x][y] = true;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur[0]+dx[i];
                int ny = cur[1]+dy[i];
                //범위 밖일 경우 skip
                if(nx<0 || nx>=n || ny<0 || ny>=n ) continue;
                //방문한 칸이거나 다른 영역일 때
                if(visited[nx][ny] || graph[nx][ny] != graph[cur[0]][cur[1]]) continue;
                q.offer(new int[]{nx, ny});
                visited[nx][ny] = true;
            }
        }

    }
}

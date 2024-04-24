import java.io.*;
import java.util.*;

public class Main {
    static int n, m, cnt, maxSize;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(graph[i][j] ==1 && !visited[i][j]){
                    bfs(i, j);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxSize);
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        int count = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] p = q.poll();
            count++;
            for(int i=0; i<4; i++){
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];

                if(nx<0 || nx >= n || ny <0 || ny>=m) continue;
                if(visited[nx][ny]||graph[nx][ny]==0) continue;
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }
        cnt++;
        if(count > 1) count--;
        maxSize = Math.max(maxSize, count);
    }
}

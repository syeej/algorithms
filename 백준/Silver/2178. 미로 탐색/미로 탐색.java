import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int n, m;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
      
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        br.close();
        //(1,1)에서 출발헤서 (N, M) 위치로 이동할 때 지나야 하는 최소 칸 수
        bfs(0, 0);
        System.out.println(graph[n-1][m-1]);
    }
    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(visited[nx][ny] || graph[nx][ny]==0) continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
                graph[nx][ny] = graph[cur[0]][cur[1]]+1;
            }
        }
    }
}

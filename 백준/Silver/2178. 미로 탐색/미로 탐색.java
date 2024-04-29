import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j)-'0';
            }
        }
        //탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(graph[i][j]==1 && !visited[i][j]){
                    visited[i][j] = true; //방문 처리
                    bfs(i, j);
                }
            }
        }
        bw.write(String.valueOf(graph[n-1][m-1]));
        bw.flush();
        br.close();
        bw.close();
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            //현재 좌표(x, y)  = (p[0], p[1])
            int[] p = q.poll();
            //인접한 좌표들 탐색
            for(int i=0; i<4; i++){
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(visited[nx][ny]||graph[nx][ny]==0) continue;
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
                graph[nx][ny] = graph[p[0]][p[1]]+1;
            }
        }
    }
}
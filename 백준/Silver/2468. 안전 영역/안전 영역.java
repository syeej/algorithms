import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        //visited = new boolean[n][n];
        int maxH = Integer.MIN_VALUE; // 최고 높이
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, graph[i][j]);
            }
        }
        //탐색
        int maxCount = Integer.MIN_VALUE;
        for(int h=0; h<=maxH; h++){ //비가 안 올 경우(h=0)
            int count = 0;
            visited = new boolean[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(!visited[i][j] && graph[i][j]>h){
                        count += bfs(i, j, h);
                    }
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        br.close();
        System.out.println(maxCount);
    }
    static int bfs(int x, int y, int standard){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                //범위 밖이면 skip
                if(nx<0||nx>=n||ny<0||ny>=n) continue;
                //이미 방문했거나 안전영역 이하 높이면 skip
                if(visited[nx][ny] || graph[nx][ny]<=standard) continue;
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});

            }
        }
        return 1;
    }
}

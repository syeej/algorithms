import java.io.*;
import java.util.*;

public class Main {
    static int n, m, cnt;
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
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxSize = 0; //그림의 최대 넒이
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //그림이 그려져 있는데 방문하지 않은 경우 bfs탐색 시작
                if(graph[i][j] ==1 && !visited[i][j]){
                    visited[i][j] = true; //해당 좌표 방문 처리
                    int area = bfs(i, j); //그림의 넓이
                    if(maxSize<area)
                        maxSize = area;
                }
            }
        }
        br.close();
        System.out.println(cnt);
        System.out.println(maxSize);
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        int size = 1; //그림 크기
        //방향(x, y)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] p = q.poll();
            // 네 방향 탐색
            for(int i=0; i<4; i++){
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];
                //새로운 좌표가 범위 벗어나면 pass
                if(nx<0 || nx >= n || ny <0 || ny>=m) continue;
                //새로운 좌표가 이미 방문했거나 색칠이 안될 경우(그래프 0) pass
                if(visited[nx][ny]||graph[nx][ny]==0) continue;
                //새로운 좌표 방문 처리
                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
                size++;
            }
        }
        cnt++;
        return size;
    }
}

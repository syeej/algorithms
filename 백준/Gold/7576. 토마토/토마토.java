import java.io.*;
import java.util.*;

public class Main {
    static int n,m, count;
    static int[][] graph;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(graph[i][j]==1){
                    q.offer(new int[]{i, j});
                }
            }
        }
        bfs();
        if(check()){
            bw.write(String.valueOf(count));
        }else{
            bw.write(String.valueOf(-1));
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static void bfs(){
        //q.add(new int[]{x, y});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int p[] = q.poll();

            for(int i=0; i<4; i++){
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];
                if(nx<0 || nx>=n || ny <0 || ny>=m) continue;
                if(graph[nx][ny]==0 ){
                    count = graph[p[0]][p[1]];
                    graph[nx][ny] = graph[p[0]][p[1]] +1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
    static boolean check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

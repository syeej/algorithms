import java.io.*;
import java.util.*;
class Point{
    int x;
    int y;
    int z;
    Point(int x, int y, int z){
        this.x  = x;
        this.y = y;
        this.z = z;
    }
}
public class Main {
    static int m, n, h, day;
    static int[][][] graph;
    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        graph = new int[h][n][m]; //3차원 배열 (z, y, x)순으로 구현
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<m; k++){
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    if(graph[i][j][k]==1){
                        q.offer(new Point(k, j, i));
                    }
                }
            }
        }
        bfs();
        br.close();
        if(check()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }
    }

    public static void bfs(){
        int[] dx = {1, 0, -1, 0, 0, 0};
        int[] dy = {0, 1, 0, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        while(!q.isEmpty()){
            Point cur = q.poll(); //현 좌표
            for(int i=0; i<6; i++){ //인접한 방향 탐색
                int nx = cur.x +dx[i];
                int ny = cur.y +dy[i];
                int nz = cur.z +dz[i];

                //범위 밖이면 skip
                if(nx<0 || nx>=m || ny<0| ny>=n||nz<0||nz>=h) continue;
                //방문한 지역 || 토마토가 없으면 skip
                if(graph[nz][ny][nx] >=1||graph[nz][ny][nx]==-1) continue;
                //인접한 곳에 안 익은 토마토가 있을 경우
                if(graph[nz][ny][nx]==0){
                    day = graph[cur.z][cur.y][cur.x];
                    graph[nz][ny][nx] = graph[cur.z][cur.y][cur.x]+1;
                    q.offer(new Point(nx, ny, nz));
                }
            }
        }
    }
    public static boolean check(){
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    if(graph[i][j][k]==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

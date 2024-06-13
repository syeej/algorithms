import java.io.*;
import java.util.*;

public class Main {
    static int w, h;

    static Character[][] graph;
    static int[][] dist;//상근 이동시간
    static int[][] fireDist; //불 이동시간
    static Queue<int[]> q;
    static Queue<int[]> fireq;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while(t>0){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            graph = new Character[h][w];
            dist = new int[h][w]; //상근 이동시간
            fireDist = new int[h][w]; //불 이동시간
            q = new LinkedList<>();
            fireq = new LinkedList<>();
            for(int i=0; i<h; i++){
                String str = br.readLine();
                for(int j=0; j<w; j++){
                    graph[i][j] = str.charAt(j);
                    //불&상근 이동시간 초기 세팅
                    //불 아직 안 났고, 상근 미로 아직 안 들어옴
                    fireDist[i][j] = -1;
                    dist[i][j] = -1;
                    if (graph[i][j] == '*') { //불
                        fireq.offer(new int[]{i, j});
                        fireDist[i][j]=0;
                    } else if (graph[i][j] == '@') { //상근
                        q.offer(new int[]{i, j});
                        dist[i][j]=0;
                    }
                }
            }
            bfs();
            t--;
        }
        System.out.println(sb);
        br.close();
    }

    static void bfs(){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        //불에 대한 BFS
        while (!fireq.isEmpty()) {
            int[] cur = fireq.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                //불 인접한 칸이 미로 범위 벗어난 경우 skip
                if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
                //불 인접한 칸이 이미 불이 나있거나 벽이면 skip
                if (fireDist[nx][ny] != -1 || graph[nx][ny] == '#') continue;
                //불 인접한 칸에 불 번짐
                fireDist[nx][ny] = fireDist[cur[0]][cur[1]] + 1;
                fireq.offer(new int[]{nx, ny});
            }
        }
        //상근에 대한 BFS
        while (!q.isEmpty()) {
            int[] cur = q.poll();

            //인접한 칸 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                //인접한 칸이 미로 범위를 벗어났다는 것은 탈출에 성공했다는 의미.
                if (nx < 0 || nx >= h || ny < 0 || ny >= w ){
                    sb.append(dist[cur[0]][cur[1]] + 1).append("\n");
                    return;
                }
                //벽이거나 상근이 이미 지나온 곳일 경우 skip
                if (dist[nx][ny] != -1 || graph[nx][ny] == '#') continue;
                //[추가] 불이 번지고 && 상근이 도착 시간 전에 이미 불이 나있을 경우 skip
                if (fireDist[nx][ny] != -1 && fireDist[nx][ny] <= dist[cur[0]][cur[1]] + 1) continue;
                //상근 이동
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        sb.append("IMPOSSIBLE").append("\n");;
    }
}
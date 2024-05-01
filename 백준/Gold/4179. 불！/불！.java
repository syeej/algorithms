import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int[][] board = new int[r][c];
        int[][] dist1 = new int[r][c]; // 불의 전파 시간
        int[][] dist2 = new int[r][c]; // 지훈이의 이동 시간
        
        Queue<int[]> que1 = new LinkedList<>();
        Queue<int[]> que2 = new LinkedList<>();
        
        for (int i = 0; i < r; i++) {
            dist1[i] = new int[c];
            dist2[i] = new int[c];
            Arrays.fill(dist1[i], -1);
            Arrays.fill(dist2[i], -1);
        }
        
        for(int i = 0; i < r; i++) {
        	String line = br.readLine();
        	for(int j = 0; j < c; j++) {
        		char ch = line.charAt(j);
        		if(ch == '#') { // 벽 : -1
        			board[i][j] = -1;
        		} else if(ch == 'F') { // 불의 위치 : 0
        			board[i][j] = 0;
        			que1.add(new int[] {i, j});
        			dist1[i][j] = 0;
        		} else if(ch == 'J') { // 지훈이의 위치 : 1
        			board[i][j] = 1;
        			que2.add(new int[] {i, j});
        			dist2[i][j] = 0;
        		}
        	}
        }
        
        // 불에 대한 BFS
       while(!que1.isEmpty()) {
    	   int[] cur = que1.poll();
    	   for(int dir = 0; dir < 4; dir++) {
    		   int nx = cur[0] + dx[dir];
    		   int ny = cur[1] + dy[dir];
    		   
    		   if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
    		   if(dist1[nx][ny] >= 0 || board[nx][ny] == -1) continue;
    		   
    		   dist1[nx][ny] = dist1[cur[0]][cur[1]] + 1;
    		   que1.add(new int[] {nx, ny});
    	   }
       }
        
       // 지훈이에 대한 BFS
       while(!que2.isEmpty()) {
    	   int[] cur = que2.poll();
    	   for(int dir = 0; dir < 4; dir++) {
    		   int nx = cur[0] + dx[dir];
    		   int ny = cur[1] + dy[dir];
    		   
    		   if(nx < 0 || nx >= r || ny < 0 || ny >= c) { // 범위를 벗어났다는 것은 탈출에 성공했다는 의미. 큐에 거리 순으로 들어가므로 최초에 탈출한 시간을 출력하면 됨.
    			   System.out.println(dist2[cur[0]][cur[1]] + 1);
    			   return;
    		   }
    		   if(dist2[nx][ny] >= 0 || board[nx][ny] == -1) continue;
    		   if(dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[cur[0]][cur[1]] + 1) continue; // 불의 전파 시간을 조건에 추가
    		   
    		   dist2[nx][ny] = dist2[cur[0]][cur[1]] + 1;
    		   que2.add(new int[] {nx, ny});
    	   }
       }
       
       System.out.println("IMPOSSIBLE"); // 여기에 도달했다는 것은 탈출에 실패했음을 의미.
    }
}
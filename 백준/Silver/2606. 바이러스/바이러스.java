import java.io.*;
import java.util.*;

public class Main {
    static int[][] computers;//컴퓨터 간 연결 상태 저장
    static boolean[] checked; //컴퓨터 감염 여부 체크
    static int n, count;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        computers = new int[n+1][n+1]; //1부터 시작
        checked = new boolean[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            computers[x][y] = computers[y][x] = 1;
        }
        dfs(1);
        br.close();
        System.out.println(count);
    }

    static void dfs(int x){
        checked[x] = true; //감염
        for(int i=1; i<n+1; i++){
            // 1~n 까지 컴퓨터 반복
            // i번 컴퓨터가 아직 감염 안 됐고, x와 연결되어 있을 때
            if(!checked[i] && computers[x][i]==1){
                dfs(i);
                count++;
            }
        }
    }
}

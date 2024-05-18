import java.io.*;
import java.util.*;

public class Main {
    static  int[][] computers;
    static boolean[] visited;

    static int n, count;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //컴퓨터 개수
        n = Integer.parseInt(br.readLine());
        //직접 연결된 컴퓨터 쌍의 수
        int m = Integer.parseInt(br.readLine());

        computers = new int[n+1][n+1]; //1번컴퓨터부터 시작
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            computers[x][y] = computers[y][x] = 1;
        }

        dfs(1);
        System.out.println(count);
        br.close();
    }
    public static void dfs(int x){
        visited[x] = true; //방문 처리
        for(int i=1; i<n+1; i++){
            if(!visited[i] && computers[x][i]==1){
                dfs(i);
                count++;
            }
        }
    }
}

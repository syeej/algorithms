import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<n+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] sumArr = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                sumArr[i][j] = arr[i][j] + sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1];
            }
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int answer = 0;
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            answer = sumArr[x2][y2] - sumArr[x2][y1-1]-sumArr[x1-1][y2]+sumArr[x1-1][y1-1];
            System.out.println(answer);
        }
        br.close();
    }
}
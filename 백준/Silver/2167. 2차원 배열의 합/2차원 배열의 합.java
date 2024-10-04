import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(k>0){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int a = i-1; a<=x-1; a++){
                for(int b = j-1; b<=y-1; b++){
                    sum+=arr[a][b];
                }
            }
            sb.append(sum).append("\n");
            k--;
        }
        br.close();
        System.out.println(sb.toString());
    }
}

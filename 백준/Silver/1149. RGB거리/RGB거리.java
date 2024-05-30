import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        //테이블 정의하기
        int[][] d = new int[1001][3]; // 2<=집의 수<=1000
        int[] red = new int[1001];
        int[] green = new int[1001];
        int[] blue = new int[1001];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            red[i] = Integer.parseInt(st.nextToken());
            green[i] = Integer.parseInt(st.nextToken());
            blue[i] = Integer.parseInt(st.nextToken());
        }
        //초기값 정하기
        d[1][0] = red[1];
        d[1][1] = green[1];
        d[1][2] = blue[1];
        //점화식 구하기 : k번째 집이 빨강이면 k-1번찌 집은 초록 혹은 파랑 + k번째 빨강 비용
        //d[k][0] = Math.min(d[k-1][1], d[k-1][2])+red[i] 
        for(int i=2; i<=n; i++){
            d[i][0] = Math.min(d[i-1][1], d[i-1][2])+red[i];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2])+green[i];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1])+blue[i];
        }
        br.close();
        System.out.println(Math.min(d[n][0], Math.min(d[n][1], d[n][2])));
    }
}

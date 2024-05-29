import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 계단의 개수는 300 이하 자연수, 계단은 한번에 한 계단 또는 두 계단 씩 오를 수 있음
        int[][] d = new int[301][3];
        //계단에 쓰여 있는 점수
        int[] scores = new int[301];
        for(int i=1; i<=n; i++){
            scores[i] = Integer.parseInt(br.readLine());
        }
        //d[k][1]: 1개의 계단을 연속해서 밝고 K번째 계단까지 올라갈 때 점수 합의 최댓값
        //초기값
        d[1][1] = scores[1];
        d[1][2] = 0;
        d[2][1] = scores[2];
        d[2][2] = scores[1] + scores[2];

        for(int i=3; i<=n; i++){
            d[i][1] = Math.max(d[i-2][1], d[i-2][2]) + scores[i];
            d[i][2] = d[i-1][1] + scores[i];
        }
        br.close();
        System.out.println(Math.max(d[n][1], d[n][2]));
    }
}

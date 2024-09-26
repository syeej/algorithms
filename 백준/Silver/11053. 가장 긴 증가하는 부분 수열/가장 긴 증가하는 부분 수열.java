import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        for(int i=0; i<n; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i] && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int answer = -1;
        for(int i=0; i<n; i++){
            answer = dp[i]>answer?dp[i]:answer;
        }
        System.out.println(answer);
   
    }
 
}

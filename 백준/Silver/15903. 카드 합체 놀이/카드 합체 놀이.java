import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//카드 개수
        int m = Integer.parseInt(st.nextToken());//카드 합체 횟수
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<m; i++){
            Arrays.sort(arr);
            long x = arr[0]+arr[1];
            arr[0] = x;
            arr[1] = x;
        }
        long answer = 0;
        for(long num : arr){
            answer += num;
        }
        System.out.println(answer);
        br.close();
    }
}

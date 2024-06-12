import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int endIdx=0;
        int answer = Integer.MAX_VALUE;
        for(int startIdx =0; startIdx<n; startIdx++){
            while(endIdx<n && arr[endIdx] - arr[startIdx]<m) endIdx++;
            if(endIdx==n) break; // en이 범위를 벗어날 경우 종료
            answer = Math.min(answer, arr[endIdx] - arr[startIdx]);
        }
        System.out.println(answer);
        br.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = arr[0]; //arr[startIdx]부터 arr[endIdx]의 합
        int endIdx = 0;
        int answer = Integer.MAX_VALUE;
        for(int startIdx = 0; startIdx<n; startIdx++){
            while(endIdx<n && sum<s) {
                endIdx++;
                if(endIdx!=n){
                    sum+=arr[endIdx];
                }
            }
            if(endIdx==n) break; //범위 밖일 경우 종료
            answer = Math.min(answer, endIdx-startIdx+1);
            sum-=arr[startIdx];
        }
        br.close();
        System.out.println((answer==Integer.MAX_VALUE)? 0: answer);

    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        //투포인터 활용
        int start=0, end=0, sum=0, answer=0;
        while(true){
            if(sum>=m){
                sum -= arr[start++];
            }else if(end==n) break; //범위 끝이면 종료
            else{
                sum += arr[end++];
            }
            if(sum==m){ //경우의 수 증가
                answer++;
            }
        }
        System.out.println(answer);
    }
}

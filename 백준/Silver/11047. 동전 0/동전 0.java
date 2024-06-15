import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine()); //오름차순으로 주어짐
        }
        for(int i=n-1; i>=0; i--){
            answer += k/arr[i]; //동전 개수
            k %= arr[i];
        }

        System.out.println(answer);
        br.close();
    }
}

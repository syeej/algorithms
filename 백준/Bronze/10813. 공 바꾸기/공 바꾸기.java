import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); //바구니 개수
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int m = Integer.parseInt(st.nextToken());

        for(int idx=0; idx<m; idx++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }
        for(int idx = 0; idx<arr.length; idx++){
            bw.write(arr[idx]+ " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
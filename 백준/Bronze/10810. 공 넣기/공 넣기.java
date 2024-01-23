import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];//바구니
        int m = Integer.parseInt(st.nextToken()); //공 넣는 횟수
        
        for(int idx=0; idx<m; idx++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int ball = i; ball<=j; ball++){
                arr[ball-1] = k;
            }
        }
        for(int idx=0; idx<arr.length; idx++){
            bw.write(arr[idx]+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
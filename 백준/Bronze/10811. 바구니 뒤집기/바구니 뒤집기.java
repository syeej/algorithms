import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int m = Integer.parseInt(st.nextToken());
        
        for(int idx=0; idx<m; idx++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            for(int x=i; x<=j; x++){
                int tmp = arr[x];
                arr[x] = arr[j];
                arr[j--] = tmp;
            }
        }
        for(int num: arr){
            bw.write(num+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
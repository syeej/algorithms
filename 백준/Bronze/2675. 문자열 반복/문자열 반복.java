import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = new String[Integer.parseInt(br.readLine())]; // 크기가 T인 배열
        StringTokenizer st;
        StringBuilder sb;
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuilder();
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int idx=0; idx<str.length(); idx++){
                sb.append(String.valueOf(str.charAt(idx)).repeat(r));
            }
            arr[i] = sb.toString();
        }
        
        for(String str: arr){
            bw.write(str + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
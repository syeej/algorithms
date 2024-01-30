import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int i = Integer.parseInt(st.nextToken());
        
        int res = a*(i-1)+1;
        bw.write(String.valueOf(res));
        bw.flush();
        br.close();
        bw.close();
    }
}
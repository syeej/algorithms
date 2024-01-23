import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            st = new StringTokenizer(br.readLine()+" ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+Integer.toString(a+b)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
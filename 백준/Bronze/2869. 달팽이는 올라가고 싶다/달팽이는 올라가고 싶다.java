import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        int d = (v-a)/(a-b);
        if((v-a)%(a-b)!=0){
            d++;
        }
        bw.write(String.valueOf(d+1));
        bw.flush();
        br.close();
        bw.close();
    }
}

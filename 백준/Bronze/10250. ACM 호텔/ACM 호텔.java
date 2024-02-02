import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(t>0){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = n%h;
            int y = n/h+1;
            if(n%h==0){
                x = h;
                y = n/h;
            }
            String res = String.valueOf(x)+String.valueOf(y);
            if(y<10){
                res = String.valueOf(x)+"0"+String.valueOf(y);
            }
            bw.write(res);
            bw.newLine();
            t--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
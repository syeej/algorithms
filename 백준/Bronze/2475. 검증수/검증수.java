import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum=0;
        
        for(int i=0; i<5; i++){
            int x = Integer.parseInt(st.nextToken());
            sum += Math.pow((double)x, 2);
        }
        bw.write(String.valueOf(sum%10));
        bw.flush();
        br.close();
        bw.close();
    }
}
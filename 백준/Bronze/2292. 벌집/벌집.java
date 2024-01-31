import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int scope = 2;
        
        if(n == 1){
            bw.write(String.valueOf(count));
        }else{
            while(scope<=n){
                scope = scope + 6*count;
                count++;
            }
            bw.write(String.valueOf(count));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
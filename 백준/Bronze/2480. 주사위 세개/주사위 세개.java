import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        
        if(a==b){
            if(b==c){
                sum = 10000+a*1000;
            }else{
                sum = 1000+a*100;
            }
        }else if(a==c){
            if(a!=b){
                sum = 1000+a*100;
            }
        }else if(b==c){
            if(a!=b){
                sum = 1000+b*100;
            }
        }else{
            int max = Math.max(a, Math.max(b, c));
            sum = max*100;
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recurfunc(num)));
        bw.flush();
        br.close();
        bw.close();
    }
    public static long recurfunc(int n){
        if(n<=1){
            return 1;
        }else{
            return n*recurfunc(n-1);
        }
    }
}
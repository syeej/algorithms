import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] ischecked = new boolean[10001];
        for(int i=1; i<10001; i++){
            int n = d(i);
            
            if(n<10001){
                ischecked[n] = true;
            }
        }
        for(int i=1; i<10001; i++){
            if(!ischecked[i]){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
    
    public static int d(int x){
        int num = x;
        
        while(x != 0){
            num = num + (x%10);
            x /= 10;
        }
        return num;
    }
}
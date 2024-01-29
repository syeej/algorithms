import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        String[] arr = str.split("");
        
        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]);
            if(i%10==9){
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
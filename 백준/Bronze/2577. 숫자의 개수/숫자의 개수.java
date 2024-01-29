import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String str = String.valueOf(a*b*c);
        int[] arr = new int[10];
        
        for(int i=0; i<str.length(); i++){
            arr[(str.charAt(i)-48)]++;
        }
        
        for(int num: arr){
            bw.write(num+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
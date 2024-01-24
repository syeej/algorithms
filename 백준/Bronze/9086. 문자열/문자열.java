import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        StringBuilder sb;
        
        for(int i=0; i<t; i++){
            String str = br.readLine();
            sb = new StringBuilder();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
            arr[i] = sb.toString();
        }
        
        for(String s: arr){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
        
    }
}
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String s: arr){
            bw.write(s);
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
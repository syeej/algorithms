import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(String str: br.readLine().split("")){
            sum += Integer.parseInt(str);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        bw.write(Integer.toString(a+b)+"\n");
        bw.write(Integer.toString(a-b)+"\n");
        bw.write(Integer.toString(a*b)+"\n");
        bw.write(Integer.toString(a/b));
        bw.newLine();
        bw.write(Integer.toString(a%b));
        bw.flush();
        bw.close();     
    }
}
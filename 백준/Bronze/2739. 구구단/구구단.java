import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(st.nextToken());
        for(int i=1; i<=9; i++){
            bw.write(n+" * "+i + " = "+n*i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        
    }
}
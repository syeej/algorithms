import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String res = "";
        for(int i=0; i<n/4; i++){
            res += "long ";
        }
        res+="int";
        
        bw.write(res);
        bw.flush();
        br.close();
        bw.close();
    }
}
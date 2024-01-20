import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String res = "";
        if(a>b){
            res = ">";
        }else if(a<b){
            res = "<";
        }else{
            res = "==";
        }

        bw.write(res);
        bw.flush();
        bw.close();
    }
}
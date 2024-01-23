import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String strLine = "";
        while((strLine  = br.readLine()) != null){
            st = new StringTokenizer(strLine);
            if(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write((a+b)+"\n");
            }else{
                break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
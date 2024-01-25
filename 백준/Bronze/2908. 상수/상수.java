import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        
        StringBuilder sba = new StringBuilder();
        for(int i=a.length()-1; i>=0; i--){
            sba.append(a.charAt(i));
        }
        StringBuilder sbb = new StringBuilder();
        for(int i=b.length()-1; i>=0; i--){
            sbb.append(b.charAt(i));
        }
        
        int numA = Integer.parseInt(sba.toString());
        int numB = Integer.parseInt(sbb.toString());
        bw.write(String.valueOf(Math.max(numA, numB)));
        bw.flush();
        br.close();
        bw.close();
    }
}
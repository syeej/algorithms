import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int i=666;
        while(n!=count){
            i++;
            String str = String.valueOf(i);
            if(str.contains("666")){
                count++;
            }
        }
        bw.write(String.valueOf(i));
        bw.flush();
        br.close();
        bw.close();
    }
}
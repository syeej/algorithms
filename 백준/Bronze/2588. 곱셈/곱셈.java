import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(a*(b%10))+"\n");
        bw.write(Integer.toString(a*((b%100)/10))+"\n");
        bw.write(Integer.toString(a*(b/100))+"\n");
        bw.write(Integer.toString(a*b));
        bw.flush();
        bw.close();
    }
}
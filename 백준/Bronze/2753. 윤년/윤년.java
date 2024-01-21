import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int year = Integer.parseInt(br.readLine());
        String res = "0";
        
        if(((year%4==0) && (year%100!=0) )|| (year%400==0 )){
           res = "1";
        }
        
        bw.write(res);
        bw.flush();
        bw.close();
    }
}
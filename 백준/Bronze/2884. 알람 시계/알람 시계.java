import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int h = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());

       String hour = "0";
       String minute = "0";
       if(m<45) {
           h--;
           if (h < 0) {
               h = 23;
           }
           minute = Integer.toString(m+15);
       }else{
           minute = Integer.toString(m-45);
       }
       hour = Integer.toString(h);
       bw.write(hour+ " "+minute);
       bw.flush();
       bw.close();       
    }
}
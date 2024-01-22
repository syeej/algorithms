import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()+" ");
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int h = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       int time = Integer.parseInt(br.readLine());
       h += ((time+m)/60);
       if(h>23){
          h-=24;
       }
       if((time+m)%60==0){
          m=0;
       }else{
          m = ((time+m)%60);
       }
       bw.write(h+ " "+m);
       bw.flush();
       bw.close();
    }
}
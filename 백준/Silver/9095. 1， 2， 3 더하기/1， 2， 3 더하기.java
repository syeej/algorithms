import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] d = new int[11]; //테이블
        //초기값
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        while(t>0){
            //정수 n은 양수이며, 11보다 작음
            int n = Integer.parseInt(br.readLine());
            for(int i=4; i<11; i++){
                d[i] = d[i-1]+d[i-2]+d[i-3];
                if(i==n)break;
            }
            System.out.println(d[n]);
            t--;
        }
        br.close();
    }
}

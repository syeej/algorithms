import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0; //배달하는 봉지의 최소 개수
        int n = Integer.parseInt(br.readLine());
        while(n>0){
            if(n%5==0){
                count += n/5;
                break;
            }
            if(n<3){
                count = -1;
                break;
            }
            n-=3;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

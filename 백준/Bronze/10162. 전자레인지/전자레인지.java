import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] timeList = {300, 60, 10}; //A, B, C
        int[] clicks = new int[3];
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<timeList.length; i++){
            clicks[i] = t/timeList[i];
            t %= timeList[i];
            if(t%timeList[2]!=0){
                clicks = new int[]{-1};
                break;
            }
        }
        for(int num: clicks){
            bw.write(num+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

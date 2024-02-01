import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //킹
        if(arr[0]==0){
            bw.write(1+" ");
        }else{
            bw.write((1-arr[0])+" ");
        }
        //퀸
        if(arr[1]==0){
            bw.write(1+" ");
        }else{
            bw.write((1-arr[1])+" ");
        }
        //룩
        if(arr[2]==0){
            bw.write(2+" ");
        }else{
            bw.write((2-arr[2])+" ");
        }
        //비숍
        if(arr[3]==0){
            bw.write(2+" ");
        }else{
            bw.write((2-arr[3])+" ");
        }
        //나이트
        if(arr[4]==0){
            bw.write(2+" ");
        }else{
            bw.write((2-arr[4])+" ");
        }
        //폰
        if(arr[5]==0){
            bw.write(8+" ");
        }else{
            bw.write((8-arr[5])+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
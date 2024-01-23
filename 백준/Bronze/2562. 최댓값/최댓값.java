import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int maxNum = arr[0];
        for(int i=1; i<arr.length; i++){
            maxNum = Math.max(maxNum, arr[i]);
        }
        bw.write(maxNum+"\n");
        
        for(int i=0; i<arr.length; i++){
            if(maxNum == arr[i]){
                bw.write(Integer.toString(i+1));
                break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
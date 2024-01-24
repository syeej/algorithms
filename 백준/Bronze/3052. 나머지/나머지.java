import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine())%42;
        }
        
        int count = 1;

        for(int i=0; i<arr.length-1; i++){
            boolean status = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    status = true;
                    break;
                }
            }
            if(!status){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
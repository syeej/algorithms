import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        String[] n = br.readLine().split("");

        for(int i=0; i<n.length; i++){
            int num = Integer.parseInt(n[i]);
            if(num == 9){
                arr[6]++;
            }else{
                arr[num]++;
            }
        }
        if(arr[6]%2!=0){
            arr[6] = arr[6]/2 + 1;
        }else{
            arr[6] /=2;
        }

        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        bw.write(String.valueOf(max));
        
        bw.flush();
        br.close();
        bw.close();
    }
}

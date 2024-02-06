import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int x = 0;
        int y = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum-arr[i]-arr[j] == 100){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i!=x && i!=y){
                bw.write(String.valueOf(arr[i]));
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

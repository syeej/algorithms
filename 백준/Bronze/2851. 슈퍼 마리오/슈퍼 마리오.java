import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int[] arr = new int[10];
        arr[0] = Integer.parseInt(br.readLine());
        for(int i=1; i<9; i++){
            arr[i] = arr[i-1] + Integer.parseInt(br.readLine());
        }
        int diff = Integer.MAX_VALUE;
        int answer =0;
        for(int i=9; i>0; i--){
            int tmp = Math.abs(100-arr[i]);
            if(diff>tmp){
                diff = tmp;
                answer = arr[i];
            }
        }*/
        int sum = 0, diff = Integer.MAX_VALUE, answer = 0;
        for(int i=0; i<10; i++){
            sum += Integer.parseInt(br.readLine());

            if(Math.abs(100-sum)<=diff){
                diff = Math.abs(100-sum);
                answer = sum;
            }
        }
        br.close();
        System.out.println(answer);
    }
}

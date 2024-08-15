import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] visitors = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            visitors[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i=0; i<x; i++){
            sum += visitors[i]; 
        }
        int maxSum = sum;
        int count = 1;
        for(int i=0; i<n-x; i++){
            sum += visitors[i+x];
            sum -= visitors[i];
            if(sum==maxSum) {
                count++;
            }
            if(sum>maxSum){ //갱신
                count = 1;
                maxSum = sum;
            }
        }
        if(maxSum == 0){
            System.out.println("SAD");
        }else{
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}

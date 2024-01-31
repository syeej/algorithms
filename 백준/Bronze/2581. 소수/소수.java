import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i=m; i<=n; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
            sum+=arr[i];
        }
        if(list.size()==0){
            bw.write(String.valueOf(-1));
        }else{
            Arrays.sort(arr);
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(arr[0]));
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static boolean isPrime(int num){
        boolean chk = true;
        if(num==1){
            chk = false;
        }else{
         for(int i=2; i<=num/2; i++){
             if(num%i==0){
                chk = false;
                break;
            }
         }
        }
        return chk;
    }
}
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++){         
            while(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                boolean isPrime = true;
                //입력받은 숫자(num)이 1이면 pass
                if(num == 1){
                    continue;
                }
                //입력받은 숫자(num)이 소수인지 판별
                for(int j=2; j<=num/2; j++){
                    if(num%j==0){
                        isPrime = false;
                        break;
                    }
                }
                //소수이면 개수 증가
                if(isPrime){
                    count++;
                 }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int res = 0;
        
        for(int i=0; i<num; i++){
            int number = i;
            int sum = 0;

            while(number != 0){
                sum += number %10;
                number /= 10;
            }
            //i 값과 각 자릿수 누적합이 같을 경우(생성자를 찾았을 경우)
            if(sum+i==num){
                res = i;
                break;
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
        br.close();
        bw.close();
    }
}

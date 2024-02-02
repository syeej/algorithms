import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = Integer.MAX_VALUE; //초기값
        String[] subArr = br.readLine().split("-");
        for(int i=0; i<subArr.length; i++){
            int sum = 0;
            String[] plusArr = subArr[i].split("\\+");
            for(String s: plusArr){
                sum += Integer.parseInt(s);
            }
            if(result == Integer.MAX_VALUE){
                result = sum;
            }else{
                result -= sum;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        br.close();
        bw.close();      
    }
}
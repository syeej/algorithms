import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine().toUpperCase(); //대소문자 구분 안함. 출력 시 대문자로 출력
        int[] arr = new int[26];
        
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-65]++;
        }
        
        int max = -1;
        char c = ' ';
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                c = (char)(i+65);
            }else if(arr[i]==max){
                c = '?';
            }
        }
        bw.write(String.valueOf(c));
        bw.flush();
        br.close();
        bw.close();
    }
}
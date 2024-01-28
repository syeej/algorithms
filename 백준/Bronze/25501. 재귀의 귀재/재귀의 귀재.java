import java.io.*;
import java.util.*;

public class Main{
    
    public static int count; //재귀함수 실행 횟수
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            count = 0; //테스트케이스별 재귀함수 실행횟수 초기화
            String str = br.readLine();
            bw.write(isPalindrome(str)+ " "+count+"\n");
            t--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static int recursion(String s, int l, int r){
        count++; //재귀 실행 횟수 증가
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
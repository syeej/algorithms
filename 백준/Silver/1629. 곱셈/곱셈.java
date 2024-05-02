import java.io.*;
import java.util.*;

public class Main {
    public static long c;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        br.close();
        System.out.println(func(a, b));
    }
    public static long func(long a,long b){
        if(b==1){ //지수가 1일 때
            return a%c;
        }
        //지수의 절반에 해당하는 a^(b/2)
        long tmp = func(a, b/2);

        //지수가 홀수일 경우
        //a^(b/2) * a&(b/2)*a이므로 a를 한 번 더 곱함
        if(b%2!=0){
            return (tmp*tmp%c) * a%c;
        }
        return tmp*tmp%c;
    }
}

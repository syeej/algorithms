import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //테이블 : d[i] = 2 x i크기의 직사각형을 채우는 방법의 수
        int[] d = new int[1001];
        //초기값 
        d[1] = 1;
        d[2] = 2;
        //점화식 찾기
        for(int i=3; i<=n; i++){
            d[i] = (d[i-1] + d[i-2])%10007;
        }
        br.close();
        System.out.println(d[n]);
    }
}

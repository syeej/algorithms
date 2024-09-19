import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = gcd(a, b);
            sb.append(a*b/x).append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
    static int gcd(int x, int y){
        while(y!=0){
            int remain = x%y;
            x = y;
            y = remain;
        }
        return x;
    }
}

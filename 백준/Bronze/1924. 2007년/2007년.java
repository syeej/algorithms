import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += month[i];
        }
        sum += d-1;
        br.close();
        System.out.println(days[sum % 7]);
    }
}
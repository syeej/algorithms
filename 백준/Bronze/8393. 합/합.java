import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
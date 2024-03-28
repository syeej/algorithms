import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());
        while(k>0){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                stack.push(num);
            }else{
                stack.pop();
            }
            k--;
        }
        int sum = 0;
        for(int n: stack){
            sum += n;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();

    }
}

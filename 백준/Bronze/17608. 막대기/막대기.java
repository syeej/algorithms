import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        int num = stack.peek();
        int count = 1;
        while(!stack.isEmpty()){
            int tmp = stack.peek();
            if(num<stack.pop()){
                count++;
                num = tmp;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

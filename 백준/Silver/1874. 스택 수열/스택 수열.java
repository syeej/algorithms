import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int start = 0;
        while(n>0){
            int num = Integer.parseInt(br.readLine());
            if(num > start){
                for(int i=start+1; i<=num; i++){
                    stack.push(i);
                    sb.append("+\n");
                }
                start = num;
            }
            if(stack.peek()==num){
                stack.pop();
                sb.append("-\n");
            }
            n--;
        }
        if(!stack.isEmpty()){
            bw.write("NO\n");
        }else{
            bw.write(sb.toString()+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

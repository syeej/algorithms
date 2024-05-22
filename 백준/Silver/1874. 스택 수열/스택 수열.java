import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        while(n>0){
            int num = Integer.parseInt(br.readLine());
            if(num>tmp){
                for(int i=tmp+1; i<=num; i++){ // 수열
                    stack.push(i);
                    sb.append("+\n");
                }
                tmp = num;
            }
            if(stack.peek()==num){
                stack.pop();
                sb.append("-\n");
            }
            n--;
        }
        if(!stack.isEmpty()){
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }
        br.close();
    }
}

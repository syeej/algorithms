import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        while(n>0){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(op.equals("pop")){
                if(stack.isEmpty()){
                    bw.write(String.valueOf(-1));
                }else{
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.newLine();
            }else if(op.equals("size")){
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            }else if(op.equals("empty")){
                if(stack.isEmpty()){
                    bw.write(String.valueOf(1));
                }else{
                    bw.write(String.valueOf(0));
                }
                bw.newLine();
            }else if(op.equals("top")){
                if(stack.isEmpty()){
                    bw.write(String.valueOf(-1));
                }else{
                    bw.write(String.valueOf(stack.peek()));
                }
                bw.newLine();
            }
            n--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
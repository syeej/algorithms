import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n>0){
            Stack<String> stack = new Stack<>();
            String[] arr = br.readLine().split("");
            for(String s: arr){
                if(s.equals("A")){
                    if(!stack.isEmpty() && stack.peek().equals("A")){
                        stack.pop();
                    }else {
                        stack.push(s);
                    }
                }else if(s.equals("B")){
                    if(!stack.isEmpty() && stack.peek().equals("B")){
                        stack.pop();
                    }else {
                        stack.push(s);
                    }
                }
            }
            if(stack.isEmpty())
                count++;
            n--;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

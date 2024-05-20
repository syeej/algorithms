import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        while(k>0){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(!stack.isEmpty()){
                    answer-=stack.pop();  
                }
            }else{
                answer+=num;
                stack.push(num);
            }
            k--;
        }
        br.close();
        System.out.println(answer);
    }
}
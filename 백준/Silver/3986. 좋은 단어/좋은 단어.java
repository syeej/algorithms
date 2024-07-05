import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n>0){
            Stack<String> stack = new Stack<>();
            String[] words = br.readLine().split("");
            for(String word: words){
                if(!stack.isEmpty() && stack.peek().equals(word)){
                    stack.pop();
                }else{
                    stack.push(word);
                }
            }
            if(stack.isEmpty()){
                count++;
            }
            n--;
        }
        br.close();
        System.out.println(count);
    }
}
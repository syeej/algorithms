import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int tmp = 1;
        int answer = 0;

        for(int i=0; i<str.length; i++){
            if(str[i].equals("(")){
                stack.push(str[i]);
                tmp *= 2;
            }else if(str[i].equals("[")){
                stack.push(str[i]);
                tmp *= 3;
            }else if(str[i].equals(")")){
                if(stack.isEmpty()|| stack.peek().equals("[")){
                    answer = 0;
                    break;
                }
                if(str[i-1].equals("(")){
                    answer += tmp;
                }
                stack.pop();
                tmp /= 2;
            }else{
                if(stack.isEmpty()|| stack.peek().equals("(")){
                    answer = 0;
                    break;
                }
                if(str[i-1].equals("[")){
                    answer += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }
        if(!stack.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
    }
}
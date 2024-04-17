import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        int res = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }else if(str.charAt(i)== ')'){
                stack.pop();
                if(str.charAt(i-1)=='('){
                    res += stack.size();
                }else{
                    res++;
                }
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
        br.close();
        bw.close();
    }
}

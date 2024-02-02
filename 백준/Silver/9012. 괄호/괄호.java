import java.io.*;
import java.util.*;

public class Main{   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            bw.write(isPS(br.readLine()));
            bw.newLine();
            t--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static String isPS(String str){
        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        for(String s: arr){
            if(s.equals("(")){
                stack.push("(");
            }else{
                if(stack.isEmpty()){
                    return "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
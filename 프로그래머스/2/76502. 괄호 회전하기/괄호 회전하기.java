import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length()-1; i++){
            if(isCorrect(sb.toString())) answer++;
            sb.append(sb.toString().charAt(0));
            sb.deleteCharAt(0);            
        }
        return answer;
    }
    public boolean isCorrect(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(!stack.isEmpty()){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }else if(c == '}'){
                if(!stack.isEmpty()){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }else if(c == ']'){
                if(!stack.isEmpty()){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
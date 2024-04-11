import java.util.*;
class Solution
{
    public int solution(String s)
    {
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(String str: arr){
            if(!stack.isEmpty() && stack.peek().equals(str)){
                stack.pop();
            }else{
                stack.push(str);
            }
         
        }
        int answer = stack.isEmpty()?1:0;
        
        return answer;
    }
}
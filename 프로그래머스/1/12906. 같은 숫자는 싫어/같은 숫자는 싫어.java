import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(i==0){
                stk.push(arr[i]);
            }else{
                if(stk.peek() != arr[i]){
                    stk.push(arr[i]);
                }
            }
        }

        int[] answer = new int[stk.size()];
        for(int i=stk.size()-1; 0<=i; i--){
            answer[i] = stk.pop();
        }
        return answer;
    }
}
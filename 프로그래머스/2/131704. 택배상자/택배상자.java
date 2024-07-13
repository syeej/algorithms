import java.util.*;
class Solution {
    public int solution(int[] order) {  
        int answer = 0;
        Stack<Integer> sub = new Stack<>();    
        int box = 1;
        for(int i : order){
            while(box<=i){
                sub.push(box++);
            }
            if(sub.pop()==i){
                answer++;
            }
            else break;
        }
        /*
        // 10%, [3, 5, 4, 2, 1] -> 5
        for(int i=1; i<=order[0]; i++){
            sub.push(i); 
        }
        List<Integer> belt = new ArrayList<>();
        for(int i=0; i<order.length; i++){
            if(sub.peek()==order[i]){
                belt.add(sub.pop());
            }else{
                break;
            }
        }
        answer = belt.size();
        */
        return answer;
    }
}
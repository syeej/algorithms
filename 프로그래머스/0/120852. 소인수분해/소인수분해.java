import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            while(n%i==0){
                if(!list.contains(i)){
                    list.add(i);
                }
                n /= i;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
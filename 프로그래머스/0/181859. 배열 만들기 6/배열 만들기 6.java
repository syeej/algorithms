import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size()-1) == arr[i]){
                    stk.remove(stk.size()-1);
                    i++;
                }else{
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        
        int[] answer;
        if(stk.isEmpty()){
            answer = new int[]{-1};
        }else{
            answer = new int[stk.size()];
            for(int j=0; j<stk.size(); j++){
                answer[j] = stk.get(j);
            }
        }
        
        return answer;
    }
}
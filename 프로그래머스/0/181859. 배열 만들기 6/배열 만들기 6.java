import java.util.*;
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

        if(stk.isEmpty()){
            return new int[]{-1};
        }else{
            return stk.stream().mapToInt(x->x).toArray();
        }
    }
}
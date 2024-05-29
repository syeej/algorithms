import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        int i=0;
		List<Integer> stk = new ArrayList<>();
		while(i<arr.length) {
			if(stk.isEmpty()) {
				stk.add(arr[i]);
				i +=1;				
			}else{
                if(stk.get(stk.size()-1)<arr[i]){
                    stk.add(arr[i]);
				    i+=1;
                }else{
                    stk.remove(stk.size()-1);
                }
            }
		}
        /*
        int[] result = new int[stk.size()];
        for(int j=0; j<result.length; j++) {
			result[j] = stk.get(j);
		}*/
        int[] result = stk.stream().mapToInt(x -> x).toArray();
        return result;
    }
}
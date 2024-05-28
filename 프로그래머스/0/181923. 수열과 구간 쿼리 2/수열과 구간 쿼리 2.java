import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for(int j=s; j<=e; j++){
                if(arr[j]>k){
                    min = Math.min(min, arr[j]);
                }
            }
            //answer[i] = min;
            answer[i] = (min==Integer.MAX_VALUE)?-1:min;
        }
        /*
        ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			ArrayList<Integer> test = new ArrayList<Integer>();
			for(int j=s; j<=e; j++) {
				if(arr[j]>k)
					test.add(arr[j]);
			}
			if(!test.isEmpty()) {
				Collections.sort(test);
				answer.add(test.get(0));
			}else {
				answer.add(-1);
			}
		
        }
        int[] result = new int[answer.size()];
		for(int i=0; i<result.length; i++) {
			result[i] = answer.get(i);
		}
    
        return result;
        */
        return answer;
    }
}
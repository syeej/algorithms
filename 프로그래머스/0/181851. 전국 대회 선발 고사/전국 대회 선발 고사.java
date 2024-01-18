import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(i, rank[i]);
            }
        }
      
        List<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList);
        int answer = 0;
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            
            if(value == valueList.get(0)){
                answer += 10000*key;
            }else if(value == valueList.get(1)){
                answer += 100*key;
            }else if(value == valueList.get(2)){
                answer += key;
            }
        }
        return answer;
    }
}
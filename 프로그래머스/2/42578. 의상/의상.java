import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>(); 
        for(String[] c : clothes){
            //종류별 개수
            map.put(c[1], map.getOrDefault(c[1], 0)+1);
        }
        for(String type: map.keySet()){
            answer *= (map.get(type)+1);
        }
        return answer-1; //아예 안 입는 경우 제외
    }
}

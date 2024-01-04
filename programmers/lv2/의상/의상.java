import java.util.HashMap;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        //의상 종류별 개수
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] clothType: clothes) {
            map.put(clothType[1], map.getOrDefault(clothType[1], 0)+1);
        }
        //의상 종류별 조합
        Set<String> keySet = map.keySet();
        for(String key: keySet) {
            answer *= map.get(key)+1;
        }
        answer -= 1; //하루에 최소 1개 의상 입음
        return answer;
    }
}

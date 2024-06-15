import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i); // (등수, 학생 번호) *등수는 모두 서로 다름
            }
        }
        //Key값(등수)로 오름차순 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        answer = 10000*map.get(list.get(0))+100*map.get(list.get(1))+map.get(list.get(2));
        return answer;
    }
}
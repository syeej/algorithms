import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            if(list.size()>=k){
                //k번째 점수와 비교
                if(list.get(k-1)<score[i]){
                    list.remove(k-1);
                    list.add(score[i]);
                }
            }else{
                list.add(score[i]);
            }
            Collections.sort(list, Collections.reverseOrder());
            answer[i] = list.get(list.size()-1);
        }
        
        return answer;
    }
}
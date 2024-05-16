import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<score.length; i++){
            if(pq.size()<k){
                pq.offer(score[i]);
            }else{
                //k번째 순위의 점수보다 높을 때
                if(pq.peek()<score[i]){
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}
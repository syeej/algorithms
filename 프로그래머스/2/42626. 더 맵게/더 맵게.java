import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        
        for(int sc: scoville){
            pque.offer(sc);
        }
        while(!pque.isEmpty()){
            if(pque.peek()<K && pque.size()>1){
                int first = pque.poll();
                int second = pque.poll();
                pque.offer(first + (second*2));
                answer++;
            }else{
                break;
            }
        }
        //모든 음식 스코빌 지수를 K이상 만들 수 없을 경우
        if(pque.peek()<K){
            answer = -1;
        }
  
        return answer;
    }
}
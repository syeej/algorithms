import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> que = new LinkedList<>();
        for(int p: prices){
            que.offer(p);
        }
        int idx = 0;
        while(!que.isEmpty()){
            int stockPrice = que.poll();
            for(int q: que){
                answer[idx]++;
                if(stockPrice>q){
                    break;
                }
            }
            idx++;
        }
        return answer;
    }
}
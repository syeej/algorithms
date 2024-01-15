import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        
        for(int t : truck_weights){
            while(true){
                if(q.isEmpty()){ //큐가 비어있을 때
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                }else{ //큐가 비어있지 않을 때
                    if(q.size() == bridge_length){
                        sum -= q.poll();
                    }else if(sum+t> weight){
                        q.offer(0);
                        answer++;
                    }else{
                        q.offer(t);
                        sum+=t;
                        answer++;
                        break;
                    }
                    
                }
            }
        }
        return answer+bridge_length;
    }
}
import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int loc = 0;
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
		for(int num: priorities) {
			pque.offer(num);
		}
        while(!pque.isEmpty()) {
			
			for(int i=0; i<priorities.length; i++) {
				if(priorities[i] == pque.peek()){
					pque.poll();
					loc++;
					if(location == i) {
						answer = loc;
						return answer;
					}
				}
			}
			
		}
        return answer;
    }
}
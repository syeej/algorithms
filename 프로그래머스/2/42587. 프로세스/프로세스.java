import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int loc =0;
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: priorities) {
            pque.offer(num);
        }
        while(!pque.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == pque.peek()){
                    //System.out.println(pque.peek()+"  "+loc);
                    pque.poll();
                    loc++;
                    if(location == i) {
                        answer = loc;
                        return answer;
                    }
                }
            }

        }
        return -1;
    }
}
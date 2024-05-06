import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            int job = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                job++;
            }
            q.offer(job);
        }
        List<Integer> list = new ArrayList<>();
        int x = q.poll();
        int day = 1;
        while(!q.isEmpty()){
            if(x >= q.peek()){
                day++;
                q.poll();
            }else{
                list.add(day);
                day = 1;
                x = q.poll();
            }
        }
        list.add(day);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
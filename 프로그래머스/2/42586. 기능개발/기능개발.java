import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //남은 작업
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int job = (int) Math.ceil(remain);
            if((100-progresses[i])/speeds[i] !=0){
                job++;
            }
            q.offer(job);
        }//5 10 1 1 20 1
        //배포 기간 구하기
        List<Integer> list = new ArrayList<>();
        int release = q.poll(); //5
        int day = 1;
        while(!q.isEmpty()){// 10 1 1 20 1
            if(release<q.peek()){ 
                list.add(day);
                day = 1;
                release = q.poll();
            }else{
                day++;
                q.poll();
            }
        }
        list.add(day);
        int[] answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
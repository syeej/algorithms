import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        //요청시간 오름차순
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        
        //처리시간 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];
            }
        });
        
        int idx = 0; //작업 순서
        int count = 0; //작업 완료 개수
        int jobtime = 0; //총 작업시간
        int finish = 0; //종료시간
        
        while( count <jobs.length){
            // 하나의 작업이 완료되는 시점(finish)까지 들어온 모든 요청을 큐에 넣음
            while(idx < jobs.length && jobs[idx][0] <= finish){
                pq.offer(jobs[idx++]);
            }
            // 큐가 비어있다면 작업 완료(finsith) 이후에 다시 요청이 들어온다는 의미
            if(pq.isEmpty()){
                finish = jobs[idx][0]; 
            }else{
                //작업 완료 전 들어온 요청 중 소요시간이 짧은 것부터 수행
                int[] job = pq.poll();
                jobtime += job[1] + finish-job[0];
                finish += job[1];
                count++;
            }   
        }
                
        answer = jobtime/jobs.length;
        return answer;
    }
}
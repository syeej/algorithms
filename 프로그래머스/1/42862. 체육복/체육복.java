import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length; //도난 당하지 않은 학생 수
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌있지만 도난당해서 빌려줄 수 없음
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++; //본인것만 남음(수업참석가능)
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
 
        //체육복을 빌릴 수 있는 학생 수
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
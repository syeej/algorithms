import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(supo1[i%5] == answers[i]) scores[0]++;
            if(supo2[i%8] == answers[i]) scores[1]++;
            if(supo3[i%10] == answers[i]) scores[2]++;
        }
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        int[] answer = {};
        if(maxScore>0){
            for(int i=0; i<scores.length; i++){
                if(maxScore == scores[i]){
                    list.add(i+1);
                }
            }
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
    
        return answer;
    }
}
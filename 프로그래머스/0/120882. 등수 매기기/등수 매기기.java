class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] scores = new double[score.length];
        for(int i=0; i<score.length; i++){
            scores[i] = (double)(score[i][0]+score[i][1])/2;
        }    
        
        for(int i=0; i<scores.length; i++){
            int idx = 1;
            for(int j=0; j<scores.length; j++){
                if(scores[i] < scores[j])
                    idx++;
                answer[i] = idx;
            }
        }
        return answer;
    }
}
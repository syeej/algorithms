class Solution {
    public int[] solution(int[] emergency) {
        //3 76 24
        //3 76 24
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            int rank = 1;
            for(int j=0; j<emergency.length; j++){
                if(i==j) continue;
                if(emergency[i]<emergency[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}
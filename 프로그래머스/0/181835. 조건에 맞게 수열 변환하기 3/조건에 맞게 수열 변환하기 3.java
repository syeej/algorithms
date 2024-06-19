class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k%2!=0){
            for(int i=0; i<answer.length; i++){
                answer[i] *= k;
            }
        }else{
            for(int i=0; i<answer.length; i++){
                answer[i] += k;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];       
        for(int num: array){
            max = Math.max(num, max);
        }
        answer[0] = max;
        for(int i=0; i<array.length; i++){
            if(array[i] == max){
                answer[1] = i;
            }
        }
        return answer;
    }
}
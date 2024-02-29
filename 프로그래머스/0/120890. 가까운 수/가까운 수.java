class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n-array[0]);
        int tmp = 0;
        
        for(int i=0; i<array.length; i++){
            tmp = Math.abs(n-array[i]);
            if(min>tmp){
                min = tmp;
                answer = array[i];
            }else if(min==tmp){
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}
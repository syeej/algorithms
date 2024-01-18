class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int k = 0;
        
        while(len > Math.pow(2, k)){
            k++;
        }

        int[] answer = new int[(int)Math.pow(2, k)];
        for(int i=0; i<len; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
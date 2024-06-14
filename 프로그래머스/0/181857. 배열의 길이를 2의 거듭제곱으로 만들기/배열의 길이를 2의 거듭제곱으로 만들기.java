class Solution {
    public int[] solution(int[] arr) {
        int k = 0;
        while(arr.length > (int)Math.pow(2, k)){
            k++;
        }

        int[] answer = new int[(int)Math.pow(2, k)];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
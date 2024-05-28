class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int tmp = 0; 
      
        for(int i=0; i<queries.length; i++){
            tmp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = tmp;
        }
  
        return answer;
    }
}
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        
        for(int[] line: lines){
            int start = line[0]+100;
            int end = line[1]+100;
            
            for(int i=start; i<end; i++){
                arr[i]++;
            }
        }
        
        for(int i: arr){
            if(i>1) answer++;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int n: numbers){
            sum+=n;
        }
        int answer = 45-sum;
    
        return answer;
    }
}
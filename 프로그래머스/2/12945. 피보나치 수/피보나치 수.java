class Solution {
    public int solution(int n) {
        //테이블
        int[] answer = new int[n+1];
        //초기값
        answer[0] = 0;
        answer[1] = 1;
        for(int i=2; i<=n; i++){
            answer[i] = (answer[i-1]+answer[i-2])%1234567;
        }
        return answer[n];
    }
}
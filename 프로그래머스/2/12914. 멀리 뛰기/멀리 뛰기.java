class Solution {
    public long solution(int n) {
        long[] d = new long[2001];
        d[1] = 1; //n = 1 -> (1)
        d[2] = 2; //n = 2 -> (1, 1), (2)
        for(int i=3; i<=n; i++){
            d[i] = (d[i-1] + d[i-2]) % 1234567;
        }
        long answer = d[n];
        //long answer = d[n] % 1234567; //테케7~16 실패
        return answer;
    }
}
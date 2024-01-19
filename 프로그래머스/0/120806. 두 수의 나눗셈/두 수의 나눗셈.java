class Solution {
    public int solution(int num1, int num2) {
       int answer = -1;
        double tmp = (double) num1 / num2;
        tmp = tmp * 1000;
        answer = (int) tmp;
        return answer;
    }
}
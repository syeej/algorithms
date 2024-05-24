class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        answer = Math.max(Integer.parseInt(sb.toString()), 2*a*b);
        return answer;
    }
}
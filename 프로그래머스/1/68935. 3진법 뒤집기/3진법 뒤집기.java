class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        sb = sb.reverse();
        int answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}
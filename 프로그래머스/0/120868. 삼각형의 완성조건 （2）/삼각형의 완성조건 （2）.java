class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int x = 0;
        answer = (max-Math.abs(sides[0] - sides[1])) + (sides[0]+sides[1]-max-1);
        return answer;
    }
}
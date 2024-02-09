class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int sum = 0;
        for(int i=0; i<sides.length; i++){
            max = Math.max(sides[i], max);
            sum += sides[i];
        }
        int answer = (max<(sum-max)) ? 1 : 2;
        return answer;
    }
}
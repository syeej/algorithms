class Solution {
    public int solution(int hp) {
        int[] soldiers = {5, 3, 1};
        int answer = 0;
        for(int s: soldiers){
            answer += hp/s;
            hp %= s;
        }
        return answer;
    }
}
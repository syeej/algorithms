class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int sangbin = n;
        while(sangbin>=a){
            //상빈이 공짜로 얻는 콜라의 합
            answer += sangbin/a*b;
            //상빈이 갖는 콜라 = 공짜 콜라 + 교환 못한 콜라
            sangbin = sangbin/a*b + sangbin%a;
        }
        return answer;
    }
}
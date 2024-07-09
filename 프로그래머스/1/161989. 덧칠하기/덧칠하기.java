class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int startR = section[0]; //롤러 시작
        for(int i=1; i<section.length; i++){
            //(롤러시작+M) 길이가 현재 칠해야하는 구역보다 작거나 같을 때
            if(startR + m <= section[i]){
                answer++; //롤러 횟수 증가
                startR = section[i];
            }
        }
        return answer;
    }
}
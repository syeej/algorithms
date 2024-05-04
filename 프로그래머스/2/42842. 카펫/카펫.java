class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown+yellow;
        int x=0;
        int y=0;
        for(int i=area; i>=1; i--){
            if(area%i==0){
                if((i*2+(area/i-2)*2)==brown){
                    if(i<area/i) break;
                    x = i;
                    y = area/i;
                }
            }
        }
        int[] answer = new int[]{x, y};
        return answer;
    }
}
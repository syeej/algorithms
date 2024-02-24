class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        while(x<=n){
            int count = 0;
            for(int i=1; i<=x; i++){
                if(x%i==0){
                    count++;
                }
                if(count==3){
                    answer++;
                    break;
                }
            }
            x++;
        }
        return answer;
    }
}
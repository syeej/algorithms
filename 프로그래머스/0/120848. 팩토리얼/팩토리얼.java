class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        while(true){ 
            result = fact(++answer);
            if(result>n){
                answer--;
                break;
            }
        }
        
        return answer;
    }
    
    public int fact(int m){
        int result = 1;
        for(int i=1; i<=m; i++){
            result *= i;
        }
        return result;
    }
}
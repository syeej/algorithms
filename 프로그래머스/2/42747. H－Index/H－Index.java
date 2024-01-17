import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int n = citations.length; //논문 수
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<n; i++){
            int h = n - i; 
            if(citations[i] >= h){
                answer = h;
                break;
            }    
        }
        return answer;
    }
}
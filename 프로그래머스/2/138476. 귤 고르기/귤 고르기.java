import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] arr = new int[tangerine[tangerine.length-1]+1];
        for(int i=0; i<tangerine.length; i++){
            arr[tangerine[i]]++;
        }
        
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--){
            k-=arr[i];
            answer++;
            if(k<=0){
                break;
            }
        }
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[] arr = new int[array[array.length-1]+1];
        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
        }
        int answer = 0;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                answer = i;
                cnt++;
            }
            if(cnt>1){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
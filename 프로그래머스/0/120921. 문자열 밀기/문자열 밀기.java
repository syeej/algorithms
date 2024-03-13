import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] arr = A.split("");
        StringBuilder sb = new StringBuilder();
        while(answer>=0){
            if(A.equals(B)){
                break;
            }
            String tmp = arr[arr.length-1];
            arr[arr.length-1] = arr[0];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = tmp;
            sb = new StringBuilder();
            for(String s: arr){
                sb.append(s);
            }
            answer++;
            if(sb.toString().equals(B)){
                break;
            }
            
            if(answer==A.length()-1){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
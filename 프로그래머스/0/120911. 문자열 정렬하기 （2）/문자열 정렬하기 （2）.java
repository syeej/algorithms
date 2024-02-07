import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();       
        for(String s: arr){
            sb.append(s);
        }
        String answer = sb.toString();
        return answer;
    }
}
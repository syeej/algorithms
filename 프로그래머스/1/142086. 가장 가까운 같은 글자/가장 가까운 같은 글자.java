import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(!list.contains(String.valueOf(s.charAt(i)))){
                list.add(String.valueOf(s.charAt(i)));
                answer[i] = -1;
            }else{
                answer[i] = i - list.lastIndexOf(String.valueOf(s.charAt(i)));
                list.add(String.valueOf(s.charAt(i)));
            }
        }
        return answer;
    }
}
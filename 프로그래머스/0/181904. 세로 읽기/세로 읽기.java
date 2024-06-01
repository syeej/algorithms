class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i=c-1; i<my_string.length(); i+=m){
            sb.append(my_string.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<my_string.length(); i+=m){
            list.add(my_string.substring(i, i+m));
        }

        String answer = "";
        for(String str: list){
            answer += str.substring(c-1, c);
        }
        return answer;
    }
}
*/
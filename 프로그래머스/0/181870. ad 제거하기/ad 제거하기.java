import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(String str: strArr){
            if(!str.contains("ad")){
                list.add(str);
            }
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
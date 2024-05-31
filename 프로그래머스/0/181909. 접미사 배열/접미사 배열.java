import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i=my_string.length()-1; i>=0; i--){
            String str = my_string.substring(i, my_string.length());
            list.add(str);
        }
        Collections.sort(list);
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}
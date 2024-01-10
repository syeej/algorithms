import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){      
            list.add(my_string.substring(my_string.length()-1-i, my_string.length()));
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
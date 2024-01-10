import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(String str: strArr){
           if(!str.contains("ad")){
               list.add(str);
           }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
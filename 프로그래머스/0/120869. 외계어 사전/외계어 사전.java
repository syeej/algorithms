import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String word : dic){
            List<String> list = new ArrayList(Arrays.asList(spell));
            for(int i=0; i<word.length(); i++){
                list.remove(String.valueOf(word.charAt(i)));
            }
            if(list.isEmpty()){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
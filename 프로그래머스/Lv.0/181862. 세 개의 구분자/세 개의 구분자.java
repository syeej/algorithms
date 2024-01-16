import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String str = "";
        
        for(int i=0; i<myStr.length(); i++){
            char c = myStr.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c'){ // a / b / c 중 하나일 때 끊음
                if(str != ""){
                    list.add(str); // str에 값이 있을 경우 list에 추가
                    str = "";
                }
            }else{
                str += c; 
            }
        }
        if(str != ""){
                list.add(str);
                str = "";
        }
        if(list.size() == 0){
            list.add("EMPTY");
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
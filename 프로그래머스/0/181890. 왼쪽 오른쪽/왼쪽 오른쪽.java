import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        String[] res = {};
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                String[] answer = Arrays.copyOfRange(str_list, 0, i);
                res = answer;
                break;
            }else if(str_list[i].equals("r")){
                String[] answer = Arrays.copyOfRange(str_list, i+1, str_list.length);
                res = answer;
                break;
            }
        }        
        return res;
    }
}
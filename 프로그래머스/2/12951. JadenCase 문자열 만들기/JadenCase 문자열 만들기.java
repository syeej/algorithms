class Solution {
    public String solution(String s) {
        String[] strArr = s.toLowerCase().split("");
        String answer = "";
        boolean flag = true;
        
        for(String str: strArr){
            answer += flag? str.toUpperCase() : str;
            flag = str.equals(" ")? true: false;
        }
        
        return answer;
    }

}
class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        for(int i=0; i<strAge.length(); i++){
            answer += String.valueOf((char)(strAge.charAt(i) + 49));
        }
        return answer;
    }
}
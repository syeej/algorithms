class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String s: arr){
            answer+= s.repeat(n);
        }
        return answer;
    }
}
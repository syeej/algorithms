class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n, my_string.length());
        /*
        for(int i=my_string.length()-n; i<my_string.length(); i++){
            answer += my_string.charAt(i);
        }
        */
        return answer;
    }
}
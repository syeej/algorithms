class Solution {
    public String solution(String my_string, int num1, int num2) {
        String s1 = String.valueOf(my_string.charAt(num1));
        String s2 = String.valueOf(my_string.charAt(num2));
        String answer = my_string.substring(0, num1) + s2 
            + my_string.substring(num1+1, num2) + s1 
            + my_string.substring(num2+1, my_string.length());
        return answer;
    }
}
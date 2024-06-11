class Solution {
    public String[] solution(String my_string) {
        //String[] answer = my_string.trim().split("\\s* \\s*");
        String[] answer = my_string.trim().split("\\s+");
        // \s는 공백, 탭을 의미
        //String[] answer = my_string.trim().split("[ ]+"); 
        //괄호 안의 문자열(여기선 공백) 여러개를 기준으로 나눔
        return answer;
    }
}

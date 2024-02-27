class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.toUpperCase().split("[A-Z]+");
        int answer = 0;
        for(String s: arr){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }      
        return answer;
    }
}
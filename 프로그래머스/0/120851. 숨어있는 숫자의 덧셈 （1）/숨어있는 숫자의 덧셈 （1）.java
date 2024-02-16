class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]", "");
        String[] arr = str.split("");
        int answer = 0;
        for(String s: arr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
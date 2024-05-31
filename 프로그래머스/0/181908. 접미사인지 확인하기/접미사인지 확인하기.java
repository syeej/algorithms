class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = my_string.endsWith(is_suffix)?1:0;
        return answer;
    }
}
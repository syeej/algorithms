class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer sub = new StringBuffer(my_string.substring(s, e+1));
        sub = sub.reverse();
        sb.replace(s, e+1, sub.toString());
        String answer = sb.toString();
        return answer;
    }
}
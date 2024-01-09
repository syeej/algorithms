class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        for(int[] query: queries){
            StringBuffer sub = new StringBuffer(sb.substring(query[0], query[1]+1));
            sub = sub.reverse();
            sb.replace(query[0], query[1]+1, sub.toString());
        }
        String answer = sb.toString();
        return answer;
    }
}
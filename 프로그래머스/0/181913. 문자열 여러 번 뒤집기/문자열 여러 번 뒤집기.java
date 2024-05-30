class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int[] query: queries){
            int s = query[0];
            int e = query[1];
            StringBuilder sub = new StringBuilder(sb.substring(s, e+1));
            sb.replace(s, e+1, sub.reverse().toString());
        }
        String answer = sb.toString();
        return answer;
    }
}
/*
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
*/
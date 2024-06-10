class Solution {
    public String solution(String my_string, String alp) {
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            if(s.equals(alp)){
                sb.append(s.toUpperCase());
            }else{
                sb.append(s);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            if(s.equals("A")){
                sb.append("B");
            }else if(s.equals("B")){
                sb.append("A");
            }
        }
        int answer = sb.toString().contains(pat)? 1 : 0;
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        String tmp = "";
        for(String s: arr){
            if(s.equals("A")){
                tmp += "B";
            }else if(s.equals("B")){
                tmp += "A";
            }
        }
        int answer = tmp.contains(pat)? 1 : 0;
        return answer;
    }
}
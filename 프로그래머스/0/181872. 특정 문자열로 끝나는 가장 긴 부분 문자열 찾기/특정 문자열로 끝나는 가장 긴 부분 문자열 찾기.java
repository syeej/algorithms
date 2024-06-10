class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int lastIndex = myString.lastIndexOf(pat);
        for(int i=0; i<lastIndex + pat.length(); i++){
            sb.append(myString.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}
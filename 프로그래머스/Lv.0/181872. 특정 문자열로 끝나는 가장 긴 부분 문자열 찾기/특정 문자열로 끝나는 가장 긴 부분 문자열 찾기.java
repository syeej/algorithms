class Solution {
    public String solution(String myString, String pat) {
        System.out.println(myString.lastIndexOf(pat));
        int idx = myString.lastIndexOf(pat);
        String answer = myString.substring(0, idx)+pat;
        return answer;
    }
}
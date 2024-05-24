class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len = s+overwrite_string.length();
        if(my_string.length() > len){
            answer = my_string.substring(0, s)+overwrite_string+my_string.substring(len);
        }else{
            answer = my_string.substring(0, s)+overwrite_string;
        }
        return answer;
    }
}
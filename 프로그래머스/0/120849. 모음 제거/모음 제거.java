class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] tmp = "aeiou".split("");
        for(int i=0; i<answer.length(); i++){
            for(int j=0; j<tmp.length; j++){
                if(String.valueOf(answer.charAt(i)).equals(tmp[j])){
                    answer = answer.replace(String.valueOf(answer.charAt(i)), "");
                }
            }
        }        
        return answer;
    }
}
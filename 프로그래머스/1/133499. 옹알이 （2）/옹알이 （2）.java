class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(String b: babbling){
            for(String a: arr){
                if(!b.contains(a+a)){
                    b = b.replace(a, " ");
                }
            }
            if(b.trim().equals("")){
                answer++;
            }
        }
        return answer;
    }
}
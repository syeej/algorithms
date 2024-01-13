class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str: order){
            if(str.contains("cafelatte")){
                answer += 5000;
            }else if(str.contains("americano") || str.contains("anything")){
                answer+= 4500;
            }
        }
        return answer;
    }
}
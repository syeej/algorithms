class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        String strK = String.valueOf(k);
        if(str.contains(strK)){
            answer=1;
            for(int i=0; i<str.length(); i++){
                if(String.valueOf(str.charAt(i)).equals(strK)){
                    break;
                }
                answer++;
            }
        }
        return answer;
    }
}
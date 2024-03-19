class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int rmv = 0;
        
        while(!s.equals("1")){
            String tmp = "";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    rmv++;
                }else{
                    tmp += s.charAt(i);
                }
            }
            s = Integer.toBinaryString(tmp.length());
            count++;
        }
        answer[0] = count;
        answer[1] = rmv;
        return answer;
    }
}
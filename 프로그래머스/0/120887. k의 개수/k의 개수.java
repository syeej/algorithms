class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        
        for(int x=i; x<=j; x++){
            String str = String.valueOf(x);
            for(int y=0; y<str.length(); y++){
               if(String.valueOf(str.charAt(y)).equals(strK))
                   answer++;
            }
        }
        return answer;
    }
}
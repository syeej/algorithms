class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryNum = Integer.toBinaryString(n);
        int countNum =0;
        for(int i=0; i<binaryNum.length(); i++){
            if(binaryNum.charAt(i) == '1')
                countNum++;
        }
        while(true){
            answer = ++n;
            String binaryX = Integer.toBinaryString(answer);
            int countX = 0;
            for(int i=0; i<binaryX.length(); i++){
                if(binaryX.charAt(i) == '1'){
                    countX++;
                }
            }
            if(countNum == countX)
                break;
        }
        return answer;
    }
}
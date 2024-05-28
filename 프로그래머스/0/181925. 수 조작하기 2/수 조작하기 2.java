class Solution {
    public String solution(int[] numLog) {
        int num =0;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<numLog.length; i++){
            /*
            switch(numLog[i]-numLog[i-1]){
                case 1 : answer += 'w'; break;
                case -1 : answer += 's'; break;
                case 10 : answer += 'd'; break;
                case -10 : answer += 'a'; break;
            }
            */
            num = numLog[i]-numLog[i-1];
            if(num==1){
                sb.append('w');
            }else if(num==-1){
                sb.append('s');
            }else if(num==10){
                sb.append('d');
            }else if(num==-10){
                sb.append('a');
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
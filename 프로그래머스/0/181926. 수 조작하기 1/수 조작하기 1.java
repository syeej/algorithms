class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i=0; i<control.length(); i++){
            switch(control.charAt(i)){
                case 'w':
                    answer+=1;
                    break;
                case 's':
                    answer -=1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -=10;
                    break;
                default:
                    break;
            }
            /*
            if(control.charAt(i) == 'w'){
                answer += 1;
            }else if(control.charAt(i) == 's'){
                answer -= 1;
            }else if(control.charAt(i) == 'd'){
                answer += 10;
            }else if(control.charAt(i) == 'a'){
                answer -= 10;
            }
            */
        }
        return answer;
    }
}
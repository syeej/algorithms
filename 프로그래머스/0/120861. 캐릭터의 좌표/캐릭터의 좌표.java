class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int w = board[0]/2;
        int h = board[1]/2;
        for(String key: keyinput){
            if(key.equals("left")){
                if(answer[0] != (w*-1)){
                    answer[0]--;
                }
            }else if(key.equals("right")){
                if(answer[0] != w){
                    answer[0]++;
                }
            }else if(key.equals("up")){
                if(answer[1] != h){
                    answer[1]++;
                }
            }else if(key.equals("down")){
                if(answer[1] != (h*-1)){
                    answer[1]--;
                }
            }
        }
        return answer;
    }
}
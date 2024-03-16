class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            //arr[0] arr[1] arr[2]->arr[4]
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int res = Integer.parseInt(arr[4]);
            if(arr[1].equals("+")){
                if((num1+num2)==res){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(arr[1].equals("-")){
                if((num1-num2)==res){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        
        }
        return answer;
    }
}
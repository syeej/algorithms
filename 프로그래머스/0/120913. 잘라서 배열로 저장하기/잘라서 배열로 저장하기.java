class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length()%n==0){
            answer = new String[my_str.length()/n];
        }else{
            answer = new String[my_str.length()/n+1];
        }

        for(int i=0; i<answer.length-1; i++){
            System.out.println(my_str.substring(n*i, n*(i+1)));
            answer[i] = my_str.substring(n*i, n*(i+1));
        }
        answer[answer.length-1] = my_str.substring(n*(answer.length-1), my_str.length());
        return answer;
    }
}
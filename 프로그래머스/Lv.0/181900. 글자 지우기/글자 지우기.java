class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");

        for(int n: indices){
            arr[n] = "";
        }
        for(String s : arr){
            answer += s;
        }
        return answer;
    }
}
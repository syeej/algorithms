class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(String str: arr){
            min = Math.min(min, Integer.parseInt(str));
            max = Math.max(max, Integer.parseInt(str));
        }
        String answer = min + " " + max;
        return answer;
    }
}
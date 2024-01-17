import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        String answer = "";
        if(arr[0].equals("0")){
            answer = "0";   
        }else{
            for(String s: arr){
                answer += s;
            }   
        }
        return answer;
    }
}
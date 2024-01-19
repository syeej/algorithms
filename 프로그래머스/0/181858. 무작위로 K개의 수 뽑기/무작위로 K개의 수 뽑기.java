import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
            if(list.size()==k){
                break;
            }
        }
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
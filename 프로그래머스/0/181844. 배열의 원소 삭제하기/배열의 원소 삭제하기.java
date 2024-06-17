import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) { 
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);   
        }
        for(int i=0; i<delete_list.length; i++){
            if(list.contains(delete_list[i])){
                //list.remove(delete_list[i]);
                list.remove(Integer.valueOf(delete_list[i]));
            }
        }
        /*
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<delete_list.length; j++){
                if(list.get(i) == delete_list[j]){
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        */
        int[] answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}
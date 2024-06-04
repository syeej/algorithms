import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int[] interval : intervals){
            for(int i=interval[0]; i<=interval[1]; i++){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(x->x).toArray(); 
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int size = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[size];
        int cnt = 0;
        //List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                //System.out.print(arr[j]);
                //list.add(arr[j]);
                answer[cnt] = arr[j];
                cnt++;
            }
        }
        
        //int[] answer = new int[list.size()];
        //for(int i=0; i<list.size(); i++){
        //    answer[i] = list.get(i);
        //}
        
        return answer;
    }
}
*/
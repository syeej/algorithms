import java.util.*;

class Solution {
    /*
    public static int func(int m){ //메모리 사용 한도 초과
        if(m%2==0){
            return m/2;
        }else{
            return 3*m+1;
        }
    }
    */
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            //list.add(func(n));
            if(n%2==0){
                n /= 2;
            }else{
                n = 3*n+1;
            }
            list.add(n);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0){
                n /= 2;
            }else{
                n = 3*n+1;
            }
            list.add(n);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        */
        return answer;
    }
}
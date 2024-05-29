import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=start_num; i<=end_num; i++){
            list.add(i);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        /*
        1. list에 대한 스트림 생성.(스트림은 시퀀스를 함수형 연산 지원)
        2. mapToInt 메소드를 통해 Integer 객체를 int로 매핑
        3. Integer::intValue는 Integer객체의 intValue()메소드 참조하는 메소드 참조
            (mapToInt(x->x)로도 사용 가능)
        4. 스트림의 요소들을 int 타입 배열로 반환
        */
        
        /*
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        */
        return answer;
    }
}
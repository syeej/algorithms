import java.util.*;
class Solution {
    //k : 최상품 사과 점수
    //m : 한 상자에 담는 사과 개수
    //p : 상자에 담긴 사과 중 가장 낮은 점수(1<=p<=k)
    //사과 한 상자 가격 : p*m
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = Arrays.asList(Arrays.stream(score).boxed().toArray(Integer[]::new));
        Collections.sort(list, Collections.reverseOrder());
        int box = 0;
        for(int i=0; i<list.size(); i++){
            if(i%m==(m-1)){
                answer += list.get(i) * m;
                box++;
                if(box==score.length/m){
                   break;
                }
            }
        }
        return answer;
    }
}
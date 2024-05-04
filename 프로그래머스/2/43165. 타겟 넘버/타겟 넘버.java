import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    //깊이 우선 탐색
    public void dfs(int[] numbers, int target, int depth, int sum){
        //마지막 노드까지 탐색했을 때
        if(depth == numbers.length){
            //다 더한 값(sum)이 target과 같을 경우 answer값 증가
            if(target == sum) answer++;
        }else{//아직 탐색할 노드가 남아있을 때
            //다음 노드 깊이(depth+1), 해당 노드 값 +/- 연산한 값
            dfs(numbers, target, depth+1, sum+numbers[depth]);
            dfs(numbers, target, depth+1, sum-numbers[depth]);
        }
    }
}
import java.util.*;

class Solution {
    
    int answer = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    public void dfs(int depth, int hp, int[][] dg){
        for(int i=0; i<dg.length; i++){
            //방문했거나 최소 필요 피로도보다 부족하면 pass
            if(visited[i]||dg[i][0]>hp) continue;
            visited[i] = true; //방문 처리
            dfs(depth+1, hp-dg[i][1], dg);
            visited[i] = false; //방문 초기화
        }
        answer = Math.max(answer, depth);
    }
}

class Solution {
    
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        int answer = 0;
        for (int i = 0; i < computers.length; i++){
            if (!visited[i]){
                answer++;   
                dfs(i, computers);    
            }   
        }
        return answer;
    }
    public void dfs(int x, int[][] computers){
        visited[x] = true;
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i] && computers[x][i]==1){
                dfs(i, computers);
            }
        }
    }
}
import java.util.*;

class Solution {
    static String[][] graph;
    static int[][] visited;
    static int m, n;    
    
    public int solution(String[] board) {
        int answer = 0;
        m = board.length;
        n = board[0].length();
        graph = new String[board.length][board[0].length()];
        visited = new int[board.length][board[0].length()];
        for(int i=0; i<board.length; i++){
            graph[i] = board[i].split("");
        }
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                if(graph[i][j].equals("R")){
                    visited[i][j] ++;
                    answer = bfs(i, j);
                }
            }
        }
        return answer;
    }
    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                while(true){
                    //범위 안이고 장애물이 아닐 때 
                    if(nx>=0&&nx<m&& ny>=0&&ny<n&&!graph[nx][ny].equals("D")){
                        nx += dx[i];
                        ny += dy[i];
                    }else{
                        nx -= dx[i];
                        ny -= dy[i];
                        break;
                    }
                }
                //방문한 적이 없을 때
                if(visited[nx][ny]==0){
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = visited[cur[0]][cur[1]]+1;
                }
                
                //도착했을 경우
                if(graph[nx][ny].equals("G")){
                    return visited[cur[0]][cur[1]];
                }
                
            }
        }
        return -1;
    }
}
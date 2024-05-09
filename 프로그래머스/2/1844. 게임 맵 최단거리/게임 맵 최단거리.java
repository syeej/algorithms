import java.util.*;
class Pos{
    int x;
    int y;
    int d;
    public Pos(int x, int y, int d){
        this.x = x;
        this.y = y;
        this.d = d;
    }
}
class Solution {
    static int m, n;
    static int[][] graph;
    static boolean[][] visited; //방문 처리
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
        
    public int solution(int[][] maps) {
        //init
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        graph = maps;
        visited = new boolean[n][m];
        //search
        /*
        if(maps[n-1][m-2]==0 && maps[n-2][m-1]==0){ //n 또는 m이 1일 때 에러
            answer = -1;
        }else{
            answer = bfs(0, 0, 1);
        }
        */
        answer = bfs(0, 0, 1);
        return answer;
    }
    static int bfs(int x, int y, int d){
        Queue<Pos> q = new LinkedList<>();
        q.offer(new Pos(x, y, d));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Pos cur = q.poll();   
            //상대 팀 진영인 경우 
            if(cur.x== n-1 && cur.y== m-1){
                return cur.d;
            }
            for(int i=0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                //maps 범위 밖이면 skip
                if(nx<0||nx>=n || ny<0||ny>=m) continue;
                //벽이거나 방문한 칸이면 skip
                if(graph[nx][ny]==0||visited[nx][ny]) continue;
                q.offer(new Pos(nx, ny, cur.d+1));
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
}
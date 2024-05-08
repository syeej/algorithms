import java.util.*;
class Solution {
    static int m, n;
    static String[][] graph;
    static boolean[][] visited;
    
    static class Point{
        int x, y;
        int time;
        public Point(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    
    public int solution(String[] maps) {
        int answer = 0;
        m = maps.length;
        n = maps[0].length();
        graph = new String[m][n];
        visited = new boolean[m][n];
        for(int i=0; i<maps.length; i++){
            graph[i] = maps[i].split("");
        }
        Point startPoint = null;
        Point leverPoint = null;
        Point endPoint = null;
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                if(graph[i][j].equals("S")){
                    startPoint = new Point(i, j, 0);
                }
                if(graph[i][j].equals("L")){
                    leverPoint = new Point(i, j, 0);
                }
                if(graph[i][j].equals("E")){
                    endPoint = new Point(i, j, 0);
                }
            }  
        }
        //시작 - 레버
        answer = bfs(startPoint.x, startPoint.y, leverPoint.x, leverPoint.y);
        //레버까지 걸린 시간이 -1보다 클 경우
        if(answer>-1){
            visited = new boolean[m][n];
            int tmp = bfs(leverPoint.x, leverPoint.y, endPoint.x, endPoint.y);
            if(tmp==-1){
                answer = -1;
            }else
                answer += tmp;
        }
        return answer;
    }
    public int bfs(int x, int y, int endX, int endY){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 0));
        visited[x][y] = true;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        while(!q.isEmpty()){
            Point cur = q.poll();
            if(cur.x == endX && cur.y==endY){
                return cur.time;
            }
            for(int i=0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                //범위 밖이거나 통로면 skip
                if(nx<0||nx>=m||ny<0||ny>=n||graph[nx][ny].equals("X")) continue;
                //처음 방문하는 좌표인 경우 탐색
                if(!visited[nx][ny]){
                    q.offer(new Point(nx, ny, cur.time+1));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}
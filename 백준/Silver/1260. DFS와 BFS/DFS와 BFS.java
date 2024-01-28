import java.io.*;
import java.util.*;

public class Main{

    public static BufferedWriter bw;
    //dfs
    public static boolean[] visitedDFS ;
    public static ArrayList<ArrayList<Integer>> dfsGraph = new ArrayList<ArrayList<Integer>>();
    
    public static void dfs(int x) throws IOException{
        visitedDFS[x] = true;//방문 처리
        bw.write(x+" ");

        // 정점의 인접한 정점들을 정렬하여 작은 번호부터 방문
        Collections.sort(dfsGraph.get(x));

        for(int i=0; i<dfsGraph.get(x).size(); i++){
            int y = dfsGraph.get(x).get(i);
            if(!visitedDFS[y]){
                dfs(y);
            }
        }
    }

    //bfs
    public static boolean[] visitedBFS;
    public static ArrayList<ArrayList<Integer>> bfsGraph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int num) throws IOException{
        Queue<Integer> q = new LinkedList<>();
        q.offer(num);
        visitedBFS[num] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            bw.write(x+ " ");

            // 정점의 인접한 정점들을 정렬하여 작은 번호부터 방문
            Collections.sort(bfsGraph.get(x));

            for(int i=0; i<bfsGraph.get(x).size(); i++){
                int y = bfsGraph.get(x).get(i);
                if(!visitedBFS[y]){
                    q.offer(y);
                    visitedBFS[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        //dfs
        visitedDFS = new boolean[n+1];
        //bfs
        visitedBFS = new boolean[n+1];

        for(int i=0; i<=n; i++){
            dfsGraph.add(new ArrayList<Integer>());
            bfsGraph.add(new ArrayList<Integer>());
        }
        //간선 정보 저장
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dfsGraph.get(x).add(y);
            dfsGraph.get(y).add(x); // 양방향 간선 추가
            bfsGraph.get(x).add(y);
            bfsGraph.get(y).add(x);
        }
        dfs(v);
        bw.newLine();
        bfs(v);
        bw.flush();
        br.close();
        bw.close();
    }
}

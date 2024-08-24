import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] parent;
    static ArrayList<Integer>[] nodeList;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n+1];
        visited = new boolean[n+1];
        nodeList = new ArrayList[n+1]; // 노드 저장
        for(int i=0; i<n+1; i++){
            nodeList[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            nodeList[s].add(e);
            nodeList[e].add(s);
        }
        dfs(1);
        for(int i=2; i<parent.length; i++){
            System.out.println(parent[i]);
        }
    }
    public static void dfs(int depth){
        visited[depth] = true;
        for(int node : nodeList[depth]){
            if(!visited[node]){
                parent[node] = depth;
                dfs(node);
            }
        }
    }
}

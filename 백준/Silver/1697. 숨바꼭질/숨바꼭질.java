import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[200002];
        boolean[] visited = new boolean[200002];
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //동생과 위치가 같을 때
        if(n==k){
            System.out.println(0);
            return;
        }
        q.offer(n);
        visited[n] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            int[] dis = {cur-1, cur+1, 2*cur};

            for(int i=0; i<dis.length; i++){
                //이동할 칸이 범위 밖일 때 skip
                if(dis[i] <0 || dis[i]>=arr.length) continue;
                //이동할 칸이 이미 방문한 칸
                if(visited[dis[i]]) continue;;
                //이동할 칸이 동생이 있는 위치일 때
                if(dis[i]==k){
                    System.out.println(arr[cur]+1);
                    return;
                }
                //이동할 칸
                arr[dis[i]] = arr[cur] + 1; //시간 추가
                visited[dis[i]] = true; //방문 처리
                q.offer(dis[i]); //큐에 삽입
            }
        }
        br.close();
    }
}

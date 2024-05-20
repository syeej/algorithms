import java.io.*;
import java.util.*;

public class Main{
    static int n, m; //입력
    static int[] arr; //수열 삼을 배열
    static boolean[] visited; //특정 수가 쓰였는지 확인

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visited = new boolean[n];
        func(0);
    }
    public static void func(int depth) {
        //재귀 깊이가 m과 같아지면 탐색과정에서 담았던 배열을 출력
        if(depth==m) {
            for(int i=0; i<m; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true; //해당 노드를 방문상태로 변경
                arr[depth] = i+1; //해당 깊이를 index로 i+1 저장
                func(depth+1);//다음 자식 노드 방문을 위해 depth 1증가시키면서 재귀 호출

                //자식노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경
                visited[i] = false;
            }
        }
        return;
    }
}

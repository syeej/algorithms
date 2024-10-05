import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, m;
    static int[] arr, ans;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        ans = new int[m];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        func(0);
    }
    private static void func(int depth){
        if(depth == m){
            for(int i=0; i<m; i++){
                System.out.print(ans[i]+ " ");
            }
            System.out.println();
            return;
        }


        for(int i=0; i<n; i++){
            if(visited[i])
                continue;

            visited[i] = true;
            ans[depth] = arr[i];
            func(depth+1);
            visited[i] = false;
        }
    }
}
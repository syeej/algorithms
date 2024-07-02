import java.util.*;
import java.io.*;

class Main {
    static int n,m;
    static int[] arr;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(1, 0);
        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs(int start, int depth) throws IOException{
        if(depth==m){
            for(int i=0; i<m; i++){
                bw.write(arr[i]+" ");
            }
            bw.newLine();
            return;
        }
        for(int i=start; i<=n; i++){
            arr[depth] = i;
            //중복 허용
            dfs(i, depth+1);
        }
        return;
    }
}
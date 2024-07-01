import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static int[] arr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(0);
        bw.flush();
        br.close();
        bw.close();
    }
    static void dfs(int depth) throws IOException{
        if(depth == m){
            for(int i=0; i<m;i++){
                bw.write(arr[i]+" ");
            }
            bw.newLine();
            return;
        }
        for(int i=0; i<n; i++){
            arr[depth] = i+1;
            dfs(depth+1);
        }
    }
}

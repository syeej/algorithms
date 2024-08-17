import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //table 길이
        int k = Integer.parseInt(st.nextToken()); //사람 위치에서 거리 길이
        String[] table = br.readLine().trim().split("");
        boolean[] visited = new boolean[n];
        // 햄버거 먹을 수 있는 범위  사람위치-k <= 사람 <= 사람위치+k
        // 햄버거를 먹을 수 있는 사람의 최대 수
        int answer = 0;
        for(int i=0; i< n; i++){
            if(table[i].equals("P")){
                // i위치에서 먹을 수 있는 범위
                //int start = (i-k)>0?i-k:0;
                int start = Math.max(i-k, 0);
                int end = Math.min(i+k, n-1);
                for(int j=start; j<=end; j++){
                    if(table[j].equals("H") && !visited[j]){
                        answer++;
                        visited[j] = true;
                        break;
                    }
                }
            }
        }
        br.close();
        System.out.println(answer);
    }
}

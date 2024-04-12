import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=n; i++){
            que.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(que.size()>1){
            for(int i=1; i<=k; i++){
                if(i==k){
                    sb.append(que.poll()).append(", ");
                    break;
                }else{
                    que.offer(que.poll());
                }
            }
        }
        sb.append(que.poll()+">");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}

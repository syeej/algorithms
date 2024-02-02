import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int backNum = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")){
                backNum = Integer.parseInt(st.nextToken());
                que.offer(backNum);
            }else if(op.equals("pop")){
                if(que.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(que.poll()).append("\n");
                }
            }else if(op.equals("size")){
                sb.append(que.size()).append("\n");
            }else if(op.equals("empty")){
                if(que.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(op.equals("front")){
                if(que.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(que.peek()).append("\n");
                }
            }else if(op.equals("back")) {
                if (que.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(backNum).append("\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int tmp=0;
        Queue<Integer> que = new LinkedList<>();

        while(n>0){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                tmp = Integer.parseInt(st.nextToken());
                que.offer(tmp);
            }else if(order.equals("pop")){
                if(que.isEmpty()){
                    bw.write(String.valueOf(-1));
                }else{
                    bw.write(String.valueOf(que.poll()));
                }
                bw.newLine();
            }else if(order.equals("size")){
                bw.write(String.valueOf(que.size()));
                bw.newLine();
            }else if(order.equals("empty")){
                if(que.isEmpty()){
                    bw.write(String.valueOf(1));
                }else{
                    bw.write(String.valueOf(0));
                }
                bw.newLine();
            }else if(order.equals("front")){
                if(que.isEmpty()){
                    bw.write(String.valueOf(-1));
                }else{
                    bw.write(String.valueOf(que.peek()));
                }
                bw.newLine();
            }else if(order.equals("back")){
                if(que.isEmpty()){
                    bw.write(String.valueOf(-1));
                }else{
                    bw.write(String.valueOf(tmp));
                }
                bw.newLine();
            }
            n--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
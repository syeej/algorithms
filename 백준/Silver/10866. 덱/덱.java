import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        while(n>0){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                deque.offerFirst(x);
            }else if(order.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                deque.offer(x);
            }else if(order.equals("pop_front")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.pollFirst()+"\n");
                }
            }else if(order.equals("pop_back")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.pollLast()+"\n");
                }
            }else if(order.equals("size")){
                bw.write(deque.size()+"\n");
            }else if(order.equals("empty")){
                if(deque.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }else if(order.equals("front")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.peekFirst()+"\n");
                }
            }else if(order.equals("back")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.peekLast()+"\n");
                }
            }
            n--;
        }        
        bw.flush();
        br.close();
        bw.close();
    } 
}
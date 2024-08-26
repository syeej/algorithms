import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2)->{
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if(abs1== abs2)
                return o1> o2?1:-1;
            return abs1-abs2;
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(pq.poll()+"\n");
                }
            }else{
                pq.add(x);
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}

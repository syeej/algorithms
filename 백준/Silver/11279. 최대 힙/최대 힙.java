import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        while(n>0){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty()){
                    bw.write(String.valueOf(0));
                }else{
                    bw.write(String.valueOf(pq.poll()));
                }
                bw.newLine();
            }else{
                pq.offer(x);
            }
            n--;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

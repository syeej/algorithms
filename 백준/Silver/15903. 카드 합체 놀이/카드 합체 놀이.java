import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//카드 개수
        int m = Integer.parseInt(st.nextToken());//카드 합체 횟수
        st = new StringTokenizer(br.readLine());
 
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(Long.parseLong(st.nextToken()));
        }
        for(int i=0; i<m; i++){
            long x = pq.poll(); //x
            x += pq.poll(); //y
            pq.add(x); //x 추가
            pq.add(x); //y 추가
        }
        long answer = 0;
        while(!pq.isEmpty()){
            answer += pq.poll();
        }
        System.out.println(answer);
        br.close();
    }
}

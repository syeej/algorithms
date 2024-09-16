import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<int[]> dq = new ArrayDeque<>();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int num = arr[0];

        for(int i=1; i<n; i++){
            dq.add(new int[]{(i+1), arr[i]});
        }
        while(!dq.isEmpty()){
            int[] cur;
            if(num>0){
                for(int i=1; i<num; i++){
                    dq.add(dq.poll());
                }
                cur = dq.poll();
            }else{
                for(int i=1; i<-num; i++){
                    dq.addFirst(dq.pollLast());
                }
                cur = dq.pollLast();
            }
            num = cur[1];
            sb.append(cur[0]+" ");
        }
        br.close();
        System.out.println(sb.toString());
    }
}

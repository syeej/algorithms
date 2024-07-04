import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int[] numList = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            numList[i] = Integer.parseInt(st.nextToken());
        }
        int count=0;
        for(int num: numList){
            int idx = q.indexOf(num);
            if(idx<=q.size()/2){
                for(int i=0; i<idx; i++){
                    q.offerLast(q.pollFirst());
                    count++;
                }
            }else{
                for(int i=0; i<q.size()-idx; i++){
                    q.offerFirst(q.pollLast());
                    count++;
                }
            }
            q.pollFirst();
        }
        br.close();
        System.out.println(count);
    }
}

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        int idx = 1;
        while(q.size()>1) {
            if (idx == k) {
                sb.append(q.poll()).append(", ");
                idx = 1;
            } else {
                q.add(q.poll());
                idx++;
            }
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        LinkedList<int[]> q;
        StringBuilder sb = new StringBuilder();
        while(t>0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String[] arr = br.readLine().replace(" ", "").split("");
            int count = 0;
            q = new LinkedList<>();
            for(int i=0; i<n; i++){
                q.offer(new int[]{Integer.parseInt(arr[i]), i});
            }
            while(!q.isEmpty()){
                int[] tmp = q.poll();
                boolean flag = true;

                for(int i=0; i<q.size(); i++){
                    if(tmp[0]<q.get(i)[0]){//아직 큐에 있는 일의 중요도가 더 클 경우
                        // ~i번 원소들을 뒤로 보냄
                        q.offer(tmp);
                        for(int j=0; j<i; j++){
                            q.offer(q.poll());
                        }
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                count++;
                if(tmp[1]==m) break;
            }
            sb.append(count).append("\n");
            t--;
        }
        System.out.println(sb);
    }
}

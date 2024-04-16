import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        for(int i=1; i<=n; i++)
            deque.offer(i);

        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int count = 0;
        /*세팅 끝*/
        for(int i=0; i<arr.length; i++){
            int targetIdx = deque.indexOf(arr[i]);
            int halfIdx = deque.size()/2;
            if(deque.size()%2==0){
                halfIdx = deque.size()/2-1;
            }
            if(targetIdx <= halfIdx){ //2번 연산
                for(int j=0; j<targetIdx; j++){
                    int tmp = deque.pollFirst();
                    deque.offerLast(tmp);
                    count++;
                }
            }else{ //3번 연산
                for(int j=0; j<deque.size()-targetIdx; j++){
                    int tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

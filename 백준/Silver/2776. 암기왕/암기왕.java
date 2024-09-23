import java.io.*;
import java.util.*;

//시간제한 : 2초 / N(1 ≤ N ≤ 1,000,000),  M(1 ≤ M ≤ 1,000,000)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(t>0){
            int n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                map.put(Integer.parseInt(st.nextToken()), 1);
            }
            int m = Integer.parseInt(br.readLine());
            int[] arr2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            for(int i=0; i<m; i++){
                if(map.containsKey(arr2[i])){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            t--;
        }
        /*
        //시간초과
        while(t>0){
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            int m = Integer.parseInt(br.readLine());
            int[] arr2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            for(int i=0; i<m; i++){
                if(list.contains(arr2[i])){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            t--;
        }
         */
        br.close();
        System.out.println(sb.toString());
    }
}

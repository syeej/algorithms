import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];
        Map<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        int rank = 0;
        for(int r: sorted){
            if(!rankingMap.containsKey(r)){
                rankingMap.put(r, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int r: arr){
            int ranking =  rankingMap.get(r);
            sb.append(ranking).append(" ");
        }
        br.close();
        System.out.println(sb.toString());
    }
}

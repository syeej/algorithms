import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Integer[] arr = new Integer[10];
        while(t>0){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<10; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());
            sb.append(arr[2]).append("\n");
            t--;
        }
        br.close();
        System.out.println(sb.toString());
    }
}

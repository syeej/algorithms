import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int ab = b;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            if(set.add(Integer.parseInt(st.nextToken()))){
                ab--;
            }
        }
        int answer = (a-ab)+(b-ab);
        System.out.println(answer);
    }
}

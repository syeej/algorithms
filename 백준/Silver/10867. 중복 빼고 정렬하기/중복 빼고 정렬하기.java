import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            list.add(iter.next());
        }
        Collections.sort(list);
        for(int num: list){
            System.out.print(num + " ");
        }
    }
}

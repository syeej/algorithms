import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        while(n>0){
            long key = Long.parseLong(br.readLine());
            map.put(key, map.getOrDefault(key, 1)+1);
            n--;
        }
        int max = -1;
        long answer = 0;
        for(long k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
                answer = k;
            }else if(map.get(k) == max){
                answer = Math.min(k, answer);
            }
        }
        System.out.println(answer);
        br.close();
    }
}

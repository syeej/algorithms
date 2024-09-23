import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Set<String> set = new HashSet<>();
        while(n>0){
            String str = br.readLine();
            if(str.equals("ENTER")){
                set.clear();
            }else{
                if(set.add(str)) answer++;
            }
            n--;
        }
        br.close();
        System.out.println(answer);
    }
}

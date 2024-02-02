import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        while(n>0){
            set.add(br.readLine());
            n--;
        }
        List<String> newList = new ArrayList<>();
        while(m>0){
            String word = br.readLine();
            if(set.contains(word)){
                newList.add(word);
            }
            m--;
        }
        Collections.sort(newList);
        
        bw.write(newList.size()+"\n");
        for(String s: newList){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
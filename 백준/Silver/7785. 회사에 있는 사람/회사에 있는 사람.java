import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        //회사에 동명이인 없음 -> 사람 이름 = key
        Set<String> record = new HashSet<>();
        while(n>0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String isEnter = st.nextToken();
            if(isEnter.equals("enter")){
                record.add(name);
            }else if(isEnter.equals("leave")){
                record.remove((name));
            }
            n--;
        }
        br.close();
        List<String> list = new ArrayList<>(record);
        Collections.sort(list, Collections.reverseOrder());
        for(String s: list){
            System.out.println(s);
        }
    }
}

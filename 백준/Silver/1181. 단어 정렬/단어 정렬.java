import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st;
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });
        bw.write(arr[0]);
        bw.newLine();
        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                bw.write(arr[i]+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
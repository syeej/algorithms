import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-97;
            if(arr[idx]==-1){
                arr[idx] = i;
            }
        }
        for(int num: arr){
            bw.write(num+ " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
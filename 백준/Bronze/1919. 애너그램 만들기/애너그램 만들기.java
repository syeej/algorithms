import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int count = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<str1.length(); i++){
            arr1[str1.charAt(i)-'a']++;
        }
        for(int i=0; i<str2.length(); i++){
            arr2[str2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
           count+= Math.abs(arr1[i]-arr2[i]);
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

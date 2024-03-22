import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String[] result = String.valueOf(a*b*c).split("");
        int[] arr = new int[10];

        for(int i=0; i<result.length; i++){
            arr[Integer.parseInt(result[i])]++;
        }

        for(int i=0; i<arr.length; i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

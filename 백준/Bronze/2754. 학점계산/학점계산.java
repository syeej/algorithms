import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split("");
        double score = 0;
        if(arr.length>1){
            if(arr[1].equals("+")) {
                score += 0.3;
            }else if(arr[1].equals("-")){
                score -= 0.3;
            }
        }
        if(arr[0].equals("A")){
            score +=4;
        }else if(arr[0].equals("B")){
            score += 3;
        }else if(arr[0].equals("C")){
            score += 2;
        }else if(arr[0].equals("D")){
            score += 1;
        }else if(arr[0].equals("F")){
            score = 0;
        }
        bw.write(String.valueOf(score));
        bw.flush();
        br.close();
        bw.close();
    }
}

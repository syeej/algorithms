import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int score = 0;
            int sum = 0;
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O'){
                    score++;
                }else{
                    score=0;
                }
                sum+=score;
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
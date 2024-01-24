import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] scores = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<scores.length; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        //최댓값 m구하기
        int m = scores[0];
        for(int i=1; i<scores.length; i++){
            m = Math.max(m, scores[i]);
        }
        
        //새 평균 구하기
        double sum = 0;
        for(int score: scores){
            sum+=((double)score/m*100);
        }
        bw.write(Double.toString(sum/scores.length));
        bw.flush();
        br.close();
        bw.close();
        
    }
}
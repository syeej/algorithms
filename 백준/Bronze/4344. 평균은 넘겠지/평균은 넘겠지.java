import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(tc>0){
            //케이스 시작
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] scores = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                scores[i] = Integer.parseInt(st.nextToken());
                sum += scores[i];
            }
            //평균
            double avg = sum / n;
            int cnt = 0;
            for(int num: scores){
                if((double)num > avg){
                    cnt++;
                }
            }
            double res = (cnt/(double)n)*100;
            double answer = Math.round(res*1000)/1000.0;
            String formatAnswer = String.format("%.2f%%", answer); 
            bw.write(formatAnswer+"\n");
           
            tc--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
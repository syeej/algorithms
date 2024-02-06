import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] lines = new int[n][2];
        StringTokenizer st;
        //입력
        for(int i=0; i<lines.length; i++){
            st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<lines.length; i++){
            int rank = 1;
            for(int j=0; j<lines.length; j++){
                if(i==j) continue;
                if(lines[i][0]<lines[j][0] && lines[i][1]< lines[j][1]){
                    rank++;
                }
            }
            bw.write(rank+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

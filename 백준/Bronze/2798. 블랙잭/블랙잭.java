import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        //탐색
        for(int i=0; i<n-2; i++){
            if(cards[i]>m) continue;
            for(int j= i+1; j<n-1; j++){
                if(cards[i]+cards[j]>m) continue;
                for(int k=j+1; k<n; k++){
                    int tmp = cards[i]+cards[j]+cards[k];
                    if(tmp == m){
                        result = tmp;
                        break;
                    }
                    if(tmp<=m){
                        result = Math.max(result, tmp);
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();

    }
}

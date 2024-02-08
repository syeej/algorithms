import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] coinTypes = {25, 10, 5, 1};

        int t = Integer.parseInt(br.readLine());
        while(t>0){
            int c = Integer.parseInt(br.readLine());
            for(int coin : coinTypes){
                bw.write(c/coin+ " ");
                c%=coin;
            }
            bw.newLine();
            t--;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
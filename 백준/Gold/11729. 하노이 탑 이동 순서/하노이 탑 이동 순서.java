import java.util.*;
import java.io.*;
public class Main {
    static int count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Hanoi(n, 1, 2, 3);

        br.close();
        System.out.println(count);
        System.out.println(sb.toString());
    }

    public static void Hanoi(int n, int start, int tmp, int to) {
        count++;
        if(n==1){
            sb.append(start+" "+to+"\n");
            return;
        }
        // N-1개를 A에서 임시장소(B)로 이동
        Hanoi(n-1, start, to, tmp);
        //가장 큰 원판 1개를 A에서 목적지(C)로 이동
        sb.append(start+" "+to+"\n");
        //N-1개를 임시 장소(B)에서 목적지(C)로 이동
        Hanoi(n-1, tmp, start, to);
    }

}

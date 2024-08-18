import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[][] count = new int[2][46]; // { A 개수, B 개수}
        count[0][2] = 1; //기계 발견했을 때 화면에 A만 표시
        count[1][1] = 1;
        count[1][2] = 1;

        for(int i=3; i<= k; i++){
            count[0][i] = count[0][i-2] + count[0][i-1];
            count[1][i] = count[1][i-2] + count[1][i-1];
        }
        br.close();
        System.out.println(count[0][k] + " " + count[1][k]);
    }
}
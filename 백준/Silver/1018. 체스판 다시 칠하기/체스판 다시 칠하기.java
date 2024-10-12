import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];

        for(int i=0; i<n; i++){
            String tmp = br.readLine();
            for(int j=0; j<m; j++){
                arr[i][j] = tmp.charAt(j);
            }
        }
        int min = 64;
        for(int i=0; i<n-7; i++){
            for(int j=0; j<m-7; j++){
                min = Math.min(min, find(i, j));
            }
        }
        br.close();
        System.out.println(min);
    }
    static int find(int x, int y){
        int count = 0;
        char color ='W';

        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != color){
                    count++;
                }
                color = color=='W'?'B':'W';
            }
            color = color=='W'?'B':'W';
        }
        count = Math.min(count, 64-count);
        return count;
    }
}

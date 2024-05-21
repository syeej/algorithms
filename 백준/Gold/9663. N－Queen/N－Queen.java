import java.io.*;
import java.util.*;

public class Main{
    static int n, count;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        queen(0);
        br.close();
        System.out.println(count);
    }
    static void queen(int depth){
        if(depth == n){
            count++;
            return;
        }
        for(int i=0; i<n; i++){
            arr[depth] = i;
            //놓을 수 있는 위치일 때 재귀
            if(isPossible(depth)){
                queen(depth+1);
            }
        }
    }
    static boolean isPossible(int c){
        for(int i=0; i<c; i++){
            //같은 행에 존재할 경우(열의 행과 i열의 행이 일치할 경우)
            if(arr[c]==arr[i]){
                return false;
            }else if(Math.abs(c-i)==Math.abs(arr[c]-arr[i])){//대각선
                return false;
            }
        }
        return true;
    }
}

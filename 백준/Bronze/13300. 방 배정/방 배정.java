import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[6][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        while(n>0){
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            arr[grade-1][sex]++;
            n--;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>0 && arr[i][j]<=k){
                    count++;
                }else if(arr[i][j]>k){
                    if(arr[i][j]%k==0){
                        count += arr[i][j]/k;
                    }else{
                        count += arr[i][j]/k+1;
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();

    }
}

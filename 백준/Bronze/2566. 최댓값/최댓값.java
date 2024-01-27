import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[9][9];
        StringTokenizer st;
        for(int i=0; i<arr.length;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxNum = -1;
        int r = -1;
        int c = -1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                maxNum = Math.max(maxNum, arr[i][j]);
                if(maxNum==arr[i][j]){
                    r = i+1;
                    c = j+1;
                }
            }
        }
        bw.write(maxNum+"\n");
        bw.write(r + " "+c);
        bw.flush();
        br.close();
        bw.close();
    }
}

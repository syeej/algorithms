import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                arr[i][j] = st.nextToken();
            }
        }
        Arrays.sort(arr, new Comparator<String[]>(){
            public int compare(String[] o1, String[] o2){
                    return Integer.parseInt(o1[0])-(Integer.parseInt(o2[0]));
            }
        });
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                bw.write(arr[i][j]+ " ");
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

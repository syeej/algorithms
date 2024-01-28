import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recur(num)));
        bw.flush();
        br.close();
        bw.close();
    }
    public static long recur(int n){
        if(n<=1){
            return n;
        }else {
            return recur(n-1)+recur(n-2);
        }
    }
}

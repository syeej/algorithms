import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(Integer.parseInt(arr[i])==num){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
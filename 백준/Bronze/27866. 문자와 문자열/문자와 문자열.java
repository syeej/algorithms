import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s= br.readLine();
        int i= Integer.parseInt(br.readLine());
        
        bw.write(s.substring(i-1, i));
        bw.flush();
        bw.close();
    }
}
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        String res = "0";
        if(x>0){
            if(y>0){
                res = "1";
            }else{
                res = "4";
            }
        }else{
            if(y>0){
                res = "2";
            }else{
                res = "3";
            }
        }
        bw.write(res);
        bw.flush();
        bw.close();
    }
}
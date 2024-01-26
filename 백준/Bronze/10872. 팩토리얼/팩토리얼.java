import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 1;
        
        if(n == 0){
            System.out.println(res);
        }else{
            for(int i=1; i<=n; i++){
                res *= i;
            }
            System.out.println(res);
        }
        br.close();
    }
}
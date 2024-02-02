import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                cnt++;
            }else{
                cnt--;
            }
        }
        if(cnt>0){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}
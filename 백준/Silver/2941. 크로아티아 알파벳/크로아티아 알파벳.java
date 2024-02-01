import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;
        int len = str.length();
        for(int i=0; i<str.length();i++){
            char x = str.charAt(i);
            count++;
            if(x == 'c' && i<len-1){
                if(str.charAt(i+1)=='='){
                    count--;
                }else if(str.charAt(i+1)=='-'){
                    count--;
                }
            }else if(x == 'd' && i<len-1){
                if(str.charAt(i+1)=='z' && i<len-2 ){
                    if(str.charAt(i+2)=='='){
                        count--;
                    }
                }else if(str.charAt(i+1)=='-'){
                    count--;
                }
            }else if(x == 'l' && i<len-1){
                if(str.charAt(i+1)=='j'){
                    count--;
                }
            }else if(x == 'n' && i<len-1){
                if(str.charAt(i+1)=='j'){
                    count--;
                }
            }else if(x == 's' && i<len-1){
                if(str.charAt(i+1)=='='){
                    count--;
                }
            }else if(x == 'z' && i<len-1){
                if(str.charAt(i+1)=='='){
                    count--;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

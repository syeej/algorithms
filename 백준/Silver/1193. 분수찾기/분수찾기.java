import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int line = 1; 
        while(x>line){
            x -= line; //위치
            line++; //행
        }
        int a= 0, b=0;
        if(line%2==0){
            a=x;
            b=line-x+1;
        }else{
            a=line-x+1;
            b=x;
        }
        System.out.println(a+"/"+b);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int e = 0, s = 0, m= 0;
        int answer = 0;
        while(true){
            answer++;
            e++;
            s++;
            m++;
            if(e==16) e = 1;
            if(s==29) s = 1;
            if(m==20) m = 1;
            if(e==E && s==S && m==M) break;
        }
        System.out.println(answer);
    }
}

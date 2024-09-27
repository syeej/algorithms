import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n>2){
            int num = n;
            while(num>0){
                int x = num%10;
                if(x==3||x==6|| x==9) answer++;
                num/=10;
            }
            n--;
        }
        sc.close();
        System.out.println(answer);
    }
}

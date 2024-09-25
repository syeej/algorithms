import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1<=n<=1000 자연수
        System.out.println(arithmetic_sequence(n));
    }
    static int arithmetic_sequence(int num){
        int answer = 0;
        if(num<100){ //99이하는 무조건 등차수열
            answer = num;
        }else{//100이상일 때
            answer = 99;
            for(int i=100; i<=num; i++){
                int n2 = i/100;
                int n1 = (i/10)%10;
                int n = i%10;

                if((n2-n1) == (n1-n)){
                    answer++;
                }
            }
        }
        return answer;
    }

}

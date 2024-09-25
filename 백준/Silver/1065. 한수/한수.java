import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1<=n<=1000 자연수
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isHansu(i)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    static boolean isHansu(int x){
        List<Integer> list = new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x /= 10;
        }
        for(int i=0; i<list.size()-2; i++){
            int dif1 = list.get(i)-list.get(i+1);
            int dif2 = list.get(i+1)-list.get(i+2);
            if(dif1!=dif2) return false;
        }
        return true;
    }
}

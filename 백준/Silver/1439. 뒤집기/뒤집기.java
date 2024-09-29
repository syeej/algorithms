import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int zero = 0;
        int one = 0;
        for(int i=0; i<str.length-1; i++){
            if(!str[i].equals(str[i+1]) && str[i].equals("0")){
                zero++;
            }else if(!str[i].equals(str[i+1]) && str[i].equals("1")){
                one++;
            }
        }
        if(str[str.length-1].equals("0")){
            zero++;
        }else{
            one++;
        }
        System.out.println(Math.min(zero, one));

    }
}
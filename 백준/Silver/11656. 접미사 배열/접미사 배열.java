import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int len = s.length();
        String[] arr = new String[len];
        for(int i=0; i<len; i++){
            arr[i] = s.substring(len-i-1, len);
        }
        Arrays.sort(arr);
        for(String str: arr){
            System.out.println(str);
        }
    }
}

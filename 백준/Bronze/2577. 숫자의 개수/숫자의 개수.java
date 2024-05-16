import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String[] str = String.valueOf(a*b*c).split("");
        int[] arr = new int[10];
        for(int i=0; i<str.length; i++){
            arr[Integer.parseInt(str[i])]++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}
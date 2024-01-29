import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String str = String.valueOf(a*b*c);
        int[] arr = new int[10];
        String[] strArr = str.split("");
        
        for(String s: strArr){
            if(s.equals("0")){
                arr[0]++;
            }else if(s.equals("1")){
                arr[1]++;
            }else if(s.equals("2")){
                arr[2]++;
            }else if(s.equals("3")){
                arr[3]++;
            }else if(s.equals("4")){
                arr[4]++;
            }else if(s.equals("5")){
                arr[5]++;
            }else if(s.equals("6")){
                arr[6]++;
            }else if(s.equals("7")){
                arr[7]++;
            }else if(s.equals("8")){
                arr[8]++;
            }else if(s.equals("9")){
                arr[9]++;
            }
        }
        for(int num: arr){
            bw.write(num+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
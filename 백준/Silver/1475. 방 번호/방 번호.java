import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nArr = br.readLine().split("");
        int[] arr = new int[10];
        
        for(int i=0; i<nArr.length; i++){
            if(nArr[i].equals("6")){
                arr[9]++;
            }else{
                arr[Integer.parseInt(nArr[i])]++;
            }
        }
        if(arr[9]%2!=0){ //99999 -> 3세트 필요
            arr[9] = arr[9]/2+1;
        }else{
            arr[9]/=2;
        }
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            answer = Math.max(answer, arr[i]);
        }
        br.close();
        System.out.println(answer);
    }
 }
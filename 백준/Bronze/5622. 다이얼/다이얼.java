import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int[] arr = new int[word.length()];
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='C'){
                arr[i] = 2;
            }else if(word.charAt(i)>='D' && word.charAt(i)<='F'){
                arr[i] = 3;
            }else if(word.charAt(i)>='G' && word.charAt(i)<='I'){
                arr[i] = 4;
            }else if(word.charAt(i)>='J' && word.charAt(i)<='L'){
                arr[i] = 5;
            }else if(word.charAt(i)>='M' && word.charAt(i)<='O'){
                arr[i] = 6;
            }else if(word.charAt(i)>='P' && word.charAt(i)<='S'){
                arr[i] = 7;
            }else if(word.charAt(i)>='T' && word.charAt(i)<='V'){
                arr[i] = 8;
            }else if(word.charAt(i)>='W' && word.charAt(i)<='Z'){
                arr[i] = 9;
            }
        }
        //시간 구하기
        int time = 0;
        for(int i=0; i<arr.length; i++){
            time+= arr[i]+1; //2 + (arr[i]-1);
        }
        bw.write(String.valueOf(time));
        bw.flush();
        br.close();
        bw.close();
    }
}
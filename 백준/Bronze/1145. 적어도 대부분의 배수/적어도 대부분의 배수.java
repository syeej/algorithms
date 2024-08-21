import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];   
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int answer = 0;
        while(true){
            answer++;
            for(int i=0; i<5; i++){
                if(answer>=arr[i] && answer %arr[i]==0){
                    count++;
                }
            }
            if(count>2){
                break;
            }
            count = 0;
        }
        System.out.println(answer);
    }
}
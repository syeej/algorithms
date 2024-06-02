import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //오름차순 정렬
        int m = Integer.parseInt(br.readLine());
        int[] findCount = new int[m];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            findCount[i] = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, findCount[i])-lowerBound(arr, findCount[i])).append(' ');
        }
        br.close();
        System.out.println(sb);
    }
    public static int lowerBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;

        while(lo<hi){ //lo와 hi가 같아질 때까지 반복
            int mid = (lo+hi)/2;
            //key값이 중간 위치의 값보다 작거나 같을 경우
            //(중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내림)
            if(key <= arr[mid]){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
    public static int upperBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;

        while(lo<hi){
            int mid = (lo+hi)/2;
            //key값이 중간 위치의 값보다 작을 경우
            if(key < arr[mid]){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
}

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(m>0){
            int searchNum = Integer.parseInt(st.nextToken());
            if(binarySearch(list, searchNum)>=0){
                bw.write("1");
            }else{
                bw.write("0");
            }
            bw.newLine();
            m--;
        }

        br.close();
        bw.flush();
        bw.close();
    }
    public static int binarySearch(List<Integer> arr, int key){
        int low = 0;
        int high = arr.size()-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(key<arr.get(mid)){
                high = mid - 1;
            }else if(key >arr.get(mid)){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

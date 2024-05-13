import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] ars) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int)Math.pow(2, n);//크기
        findRC(size, r, c);
        System.out.println(count);
        br.close();
    }

    public static void findRC(int size, int r, int c){
        if(size==1){
            return;
        }
        if(r<size/2 && c<size/2){ //왼쪽 위
            findRC(size/2, r, c);
        }else if(r<size/2 && c>=size/2){ //오른쪽 위
            count+=size * size/4;
            findRC(size/2, r, c-size/2);
        }else if(r>=size/2 && c<size/2){ //왼쪽 아래
            count += (size*size/4)*2;
            findRC(size/2, r-size/2, c);
        }else{ //오른쪽 아래
            count += (size*size/4)*3;
            findRC(size/2, r-size/2, c-size/2);
        }
    }
}

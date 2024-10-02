import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        String word = br.readLine().trim();
        int answer = 0;
        while(str.contains(word)){
            answer++;
            str = str.replaceFirst(word,"/");
        }
        br.close();
        System.out.println(answer);
    }
}

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        while(n>0){
            String word = br.readLine().trim();
            if(word.length()>=m) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            n--;
        }
        List<String> wordList = new ArrayList<>(map.keySet());

        /*Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                int freq = map.get(w2).compareTo(map.get(w1));
                if(freq!=0) return freq;

                int length = Integer.compare(w2.length(), w1.length());
                if(length!=0) return length;

                return w1.compareTo(w2);
            }
        });*/
        wordList.sort((w1, w2) -> {
            int freq = Integer.compare(map.get(w2), map.get(w1));
            if (freq != 0) return freq;

            int length = Integer.compare(w2.length(), w1.length());
            if (length != 0) return length;

            return w1.compareTo(w2);
        });
        br.close();
        StringBuilder sb = new StringBuilder();
        for(String s: wordList){
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}

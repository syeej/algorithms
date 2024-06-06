import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> all = new HashMap<>(); //장르별 총 개수
        HashMap<String, HashMap<Integer, Integer>> genre = new HashMap<>(); //장르-곡별 재생수
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<genres.length; i++){
            String name = genres[i];
            int count = plays[i];
            all.put(name, all.getOrDefault(name, 0)+ count);
            HashMap<Integer, Integer> tmp = new HashMap<>();
            tmp.put(i, count);
            if(genre.containsKey(name)){
                genre.get(name).put(i, count);
            }else{
                genre.put(name, tmp);    
            }
        }
        //정렬
        List<String> keys = new ArrayList(all.keySet());
        Collections.sort(keys, (s1, s2)-> all.get(s2) - all.get(s1));
        
        for(String key : keys){
            List<Integer> genreKey = new ArrayList(genre.get(key).keySet());
            
            Collections.sort(genreKey, (s1, s2)-> genre.get(key).get(s2) - genre.get(key).get(s1));
            list.add(genreKey.get(0));
            if(genreKey.size()>1){
                list.add(genreKey.get(1));
            }
        }
        /*
        for(String key : all.keySet()){
            System.out.println(key+" "+all.get(key));
        }
        for(String key: genre.keySet()){
            System.out.println(key);
            for(int kkey : genre.get(key).keySet()){
                System.out.println(kkey + " "+ genre.get(key).get(kkey));
            }
        }
        */
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
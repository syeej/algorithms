import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        /*
        조건 : LRU
        페이지 부재 발생 시 가장 오랫동안 사용되지 않은 페이지 제거
        */
        int answer = 0;
        Queue<String> cache = new LinkedList<>();
        if(cacheSize==0){
            answer = cities.length*5;
            return answer;
        }
        for(String city : cities){
            String c = city.toLowerCase();
            if(cache.contains(c)){
                cache.remove(c);
                cache.offer(c);
                answer+=1;
            }else{
                if(cache.size()<cacheSize){
                    cache.offer(c);
                }else{
                    cache.poll();
                    cache.offer(c);
                }
                answer+=5;
            }
        }
        return answer;
    }
}
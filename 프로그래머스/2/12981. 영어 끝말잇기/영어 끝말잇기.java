import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int p = 0;
        int count = 0;
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<words.length; i++){
            if(set.contains(words[i])){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;    
            }
            set.add(words[i]);
            //앞사람 단어의 마지막으로 시작 안하는 경우
            if(i!=0){
                String str1 = words[i-1].substring(words[i-1].length()-1, words[i-1].length());
                String str2 = words[i].substring(0, 1);
                if(!str1.equals(str2)){
                    System.out.println(i);
                    answer[0]  = i%n+1;
                    answer[1] = i/n+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
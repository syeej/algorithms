import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(String[] strArr) {
        Integer[] wordLen = new Integer[30]; //Collections.reverseOrder() int 사용 불가
        Arrays.fill(wordLen, 0); //배열을 0으로 초기화
        for(String str: strArr){
            wordLen[str.length()-1]++;
        }
        Arrays.sort(wordLen, Collections.reverseOrder());
        int answer = wordLen[0];
        return answer;
    }
}
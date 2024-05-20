import java.util.*;
class Solution {
    //윤년 = 2월 29일까지
    public String solution(int a, int b) {
        String[] arr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int date = 0;
        for(int i=1; i<a; i++){
            switch(i){
                case 1, 3, 5, 7, 8, 10, 12:
                    date += 31;
                    break;
                case 2:
                    date+=29;
                    break;
                case 4, 6, 9, 11:
                    date+=30;
                    break;
            }
        }
        date += b;        
        String answer = arr[date%7];
        return answer;
    }
}
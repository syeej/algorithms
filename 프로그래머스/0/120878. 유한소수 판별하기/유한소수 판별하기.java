import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int bb = b/gcd(a, b);
        
        while(bb != 1){
            if(bb%2 == 0){
                bb /=2;
            }else if(bb%5 ==0){
                bb /= 5;
            }else{
                return 2;
            }
        }
        return 1;
    }
    
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        /*
        n: 5 2 1
        a: 1 0 1 = 2
        n: 6 3 1
        a: 0 1 1 = 2
        */
        while(n>0){
            if(n%2!=0){
                ans++;
            }
            n/=2;
        }
        return ans;
    }
}
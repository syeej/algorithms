import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pickNum = nums.length/2;

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }
        if(pickNum >= set.size()){
            answer = set.size();
        }else{
            answer = pickNum;
        }
        return answer;
    }
}

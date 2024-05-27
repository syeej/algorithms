class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for(int i=0; i<num_list.length; i++){
            mul *= num_list[i];
            sum += num_list[i];
        }
        int answer = (mul < sum*sum) ? 1: 0;
        return answer;
    }
}
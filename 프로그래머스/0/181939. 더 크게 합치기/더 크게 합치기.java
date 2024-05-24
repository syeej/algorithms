class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(a).append(b);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b).append(a);
        if(Integer.parseInt(sb1.toString()) >= Integer.parseInt(sb2.toString()))
            answer = Integer.parseInt(sb1.toString());
        else
            answer = Integer.parseInt(sb2.toString());
        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(String s1: cards1){
            q1.offer(s1);
        }
        for(String s2: cards2){
            q2.offer(s2);
        }
        int count = 0;
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(q1.peek())){
                q1.poll();
                count++;
            }else if(goal[i].equals(q2.peek())){
                q2.poll();
                count++;
            }
        }
        String answer = goal.length==count ? "Yes":"No";
        //String answer = (q1.isEmpty()&&q2.isEmpty())?"Yes":"No";
        return answer;
    }
}
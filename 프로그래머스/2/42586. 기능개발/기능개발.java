import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
		int[] functions = new int[progresses.length];
		
		for(int i=0; i<progresses.length; i++) {
			functions[i] = (100-progresses[i])/speeds[i];
			if((100-progresses[i])%speeds[i]!=0) {
				functions[i]+=1;
			}
		}
		
		int pre = functions[0];
		int days = 1;
		for(int i=1; i<progresses.length; i++) {
			if(pre>=functions[i]) {
				days++;
			}else {
				list.add(days);
				days = 1;
				pre = functions[i]; 
			}
		}
		
		list.add(days);
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}
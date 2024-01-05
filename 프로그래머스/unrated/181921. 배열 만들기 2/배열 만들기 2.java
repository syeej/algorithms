import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<= r; i++) {
			boolean flag = true;
			for(String s: (i+"").split("")) {
				if(s.equals("5") || s.equals("0")) {
					continue;
				}
				flag = false;
				break;
			}
			if(flag) {
				list.add(i);
			}
		}
        int[] answer = new int[list.size()];
		if(list.isEmpty()) {
			answer = new int[] {-1};
		}else {
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
        return answer;
    }
}
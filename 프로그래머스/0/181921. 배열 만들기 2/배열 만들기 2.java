import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String[] arr = String.valueOf(i).split("");
            for(String s: arr){
                //l이상 r이사의 정수 중에 5 또는 0이 아닌 문자열이 있는 경우 다음 정수
                if(! (s.equals("5")||s.equals("0"))){
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag){
                list.add(i);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            return new int[]{-1};
        }else{
            answer = list.stream().mapToInt(x -> x).toArray();
            /*
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            */
        }
        /*
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
        */
        return answer;
    }
}
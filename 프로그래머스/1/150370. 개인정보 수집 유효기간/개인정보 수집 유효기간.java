import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
		int todayY = Integer.parseInt(today.substring(0, 4));
		int todayM = Integer.parseInt(today.substring(5, 7));
		int todayD = Integer.parseInt(today.substring(8, 10));
		int todayDate = todayD + todayM*28 + todayY*28*12; 
		
		String privacy ="";
		HashMap<String, Integer> map = new HashMap<>(terms.length);
		for(String t : terms) {
			map.put(String.valueOf(t.charAt(0)), Integer.parseInt(t.substring(2)));
		}

        int chk = 0;
		int year=0, month =0, day =0;
		for(int i=0; i<privacies.length; i++) {
			privacy = privacies[i].substring(privacies[i].length()-1);
			chk = map.get(privacy);
			year = Integer.parseInt(privacies[i].substring(0, 4));
			month = Integer.parseInt(privacies[i].substring(5,7));
			day = Integer.parseInt(privacies[i].substring(8, 10));
			int chkdate = day + month*28 + year*28*12 + chk*28;
			if(chkdate<=todayDate) {
				list.add(i+1);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}
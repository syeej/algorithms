class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(c);
                continue;
            }
            if(c>='a' && c<='z'){
                if(c+n > 'z') {
					sb.append((char)(c-26+n));
				}else {
                    sb.append((char)(c+n));
				}
			}else if(c>='A' && c<='Z') { //대문자
				if(c+n > 'Z') {
                    sb.append((char)(c-26+n));
				}else {
					sb.append((char)(c+n));
				}
			}
        }
        String answer = sb.toString();
        return answer;
    }
}
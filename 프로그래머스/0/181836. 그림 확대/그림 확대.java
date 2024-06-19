class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuilder sb;
        
        for(int i=0; i<picture.length; i++){
            sb = new StringBuilder();
            for(int j=0; j<picture[i].length(); j++){
                sb.append(Character.toString(picture[i].charAt(j)).repeat(k));
            }
            for(int m=0; m<k; m++){
                answer[i*k+m] = sb.toString();
            }
        }
        
        
        return answer;
    }
}
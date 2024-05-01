class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] map1 = new String[n][n];
        String[][] map2 = new String[n][n];
        //10진수 → 2진수 변환
        for(int i=0; i<n; i++){
            String str1 = String.format("%0"+n+"d",Long.parseLong(Long.toBinaryString(arr1[i])));
            String str2 = String.format("%0"+n+"d",Long.parseLong(Long.toBinaryString(arr2[i])));
            for(int j=0; j<n; j++){
                map1[i][j] = String.valueOf(str1.charAt(j));
                map2[i][j] = String.valueOf(str2.charAt(j));
            }
        }
        //map1, map2으로 전체 지도(map) 만들기
        String[][] map = new String[n][n];
        String[] answer = new String[n];
        StringBuilder sb;
        for(int i=0; i<n; i++){
            sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if(map1[i][j].equals("1") || map2[i][j].equals("1")){
                    map[i][j] = "#";
                }else if(map1[i][j].equals("0") && map2[i][j].equals("0")){
                    map[i][j] = " ";
                }
                sb.append(map[i][j]);
            }
            answer[i] = sb.toString();
        }    
        return answer;
    }
}
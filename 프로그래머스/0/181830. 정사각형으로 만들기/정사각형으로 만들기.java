class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length; //행의 수
        int col = arr[0].length; //열의 수
        int[][] answer = {};
        if(row > col){
            answer = new int[row][row];
            for(int i=0; i<answer.length; i++){
                for(int j=0; j<col; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }else if(row < col){
            answer = new int[col][col];
            for(int i=0; i<row; i++){
                for(int j=0; j<answer[i].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }else{
            answer = arr;
        }

        return answer;
    }
}
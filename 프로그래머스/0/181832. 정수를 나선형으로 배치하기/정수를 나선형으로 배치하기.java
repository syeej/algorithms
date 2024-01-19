class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 값
        int d = 0; //방향
        int row = 0;
        int col = 0;
        
        while(num<=n*n){
            answer[row][col] = num++;
            
            if(d == 0){
                if(col == n-1 || answer[row][col+1] != 0){
                    d = 1;
                    row++; // [0][n-1] -> [1][n-1]  / [1][n-2] -> [2][n-2] 
                }else{
                    col++;
                }
            }else if(d == 1){
                if(row == n-1|| answer[row+1][col] !=0){
                    d = 2;
                    col--; // [n-1][n-1] -> [n-1][n-2] / [n-2][n-2] -> [n-2][n-3]
                }else{
                    row++;
                }
            }else if(d == 2){
                if(col == 0 || answer[row][col-1] != 0){
                    d = 3;
                    row--;
                }else{
                    col--;
                }
            }else if(d == 3){
                if(row == 0 || answer[row-1][col] != 0 ){
                    d = 0;
                    col++;
                }else{
                    row--;
                }
            }
        }
        return answer;
    }
}
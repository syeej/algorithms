class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while(true){
            boolean flag = false;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] /= 2;
                    flag = true;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i] = arr[i]*2 + 1;
                    flag = true;
                }
            }
            answer++;
            if(!flag) break;
        }
        return answer-1;
    }
}

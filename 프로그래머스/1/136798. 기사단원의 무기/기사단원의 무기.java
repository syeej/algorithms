
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for(int i=0; i<number; i++){
            arr[i] = func(i+1);
            if(arr[i] > limit){
                answer += power;
            }else{
                answer += arr[i];
            }
        }  
        return answer;
    }
    //약수 개수 구하기
    public int func(int num){
        int count = 0;
        for(int i=1; i<= (int)Math.sqrt(num); i++){
            if(num%i==0){
                if(i==num/i){ // 2*2 = 4
                    count++;
                }else{ //1*4
                    count+=2;
                }
            }
        }
        return count;
    }
}
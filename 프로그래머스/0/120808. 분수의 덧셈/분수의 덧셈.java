class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numers = numer1*denom2 + numer2*denom1;
        int denoms = denom1 * denom2;
        for(int i=numers-1; i>1; i--){
            if(numers%i==0 && denoms %i==0){
                numers /=i;
                denoms /=i;
            }
        }
        int[] answer = {numers, denoms};
        return answer;
    }
}
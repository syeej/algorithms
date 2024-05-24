class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(n>1){
             if(Math.abs(a-b)==1 && Math.max(a, b)%2==0){
                 /*
                 1-2 / 3-4 / 5-6 만 대진 가능
                 2-3 대진 불가
                 */
                break;
            }
            if(a%2!=0){
                a=a/2+1;
            }else{
                a/=2;
            }
            if(b%2!=0){
                b= b/2+1;
            }else{
                b/=2;
            }
            answer++;
            n/=2;
        }
        
        return answer;
    }
}
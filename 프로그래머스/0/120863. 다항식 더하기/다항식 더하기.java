class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] strArr = polynomial.split(" ");
        int xSum = 0;
        int sum = 0;
        for(String str: strArr){
            if(str.contains("x")){
                xSum += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            }else if(!str.equals("+")){
                sum += Integer.parseInt(str);
            }
        }

        if(xSum != 0){
            answer = xSum+"x";
            if(xSum == 1){
            answer = "x";
            }
        }   
        
        if(sum != 0){
            if(xSum!=0){
                answer += " + "+sum;
            }else{
                answer = String.valueOf(sum);
            }
        }else if(xSum==0 && sum==0){
            answer += "0";
        }
        return answer;
    }
}
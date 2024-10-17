import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for(int i=0; i<str1.length()-1; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);

            if(first>='A' && first<='Z' && second >='A' && second<='Z'){
                list1.add(first+""+second);
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);

            if(first>='A' && first<='Z' && second >='A' && second<='Z'){
                list2.add(first+""+second);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for(String s : list1){
            if(list2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        for(String s: list2){
            union.add(s);
        }
        double x = 0;
        if(union.size()==0){
            x = 1;
        }else{
            x = (double)intersection.size() / (double) union.size();
        }
        int answer = (int)(x*65536);
        return answer;
    }
}
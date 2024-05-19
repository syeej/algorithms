import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /*
        백스페이스 입력 (-)  :    X-  글자 X 삭제
        화살표 입력 (< 또는 > 왼쪽)  :  왼쪽 또는 오른쪽으로 1만큼 움직임
         */
        while(t>0){
            String[] strArr = br.readLine().split("");
            LinkedList<String> list = new LinkedList<>();
            ListIterator<String> iter = list.listIterator();

            for(int i=0; i<strArr.length; i++){
                if(strArr[i].equals("<")){
                    if(iter.hasPrevious()){
                        iter.previous();
                    }
                }else if(strArr[i].equals(">")){
                    if(iter.hasNext()){
                        iter.next();
                    }
                }else if(strArr[i].equals("-")){
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                }else{
                    iter.add(strArr[i]);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(String s : list){
                sb.append(s);
            }
            System.out.println(sb);
            t--;
        }
    }
}

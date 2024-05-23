import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        Stack<String> stack = new Stack<>();
        Stack<String> temp = new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(String.valueOf(str.charAt(i)));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(m>0){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("P")){ //커서 왼쪽에 문자 추가
                String word = st.nextToken();
                stack.push(word);
            }else if(order.equals("L")){ //커서를 왼쪽으로 한칸(비어있을 경우 무시)
                if(!stack.isEmpty()){
                    temp.push(stack.pop());
                }
            }else if(order.equals("B")){ //커서 왼쪽 문자 삭제
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(order.equals("D")){ //커서를 오른쪽으로 한칸
                if(!temp.isEmpty()){
                    stack.push(temp.pop());
                }
            }
            m--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            sb.append(temp.pop());
        }
        br.close();
        System.out.println(sb);
    }
}

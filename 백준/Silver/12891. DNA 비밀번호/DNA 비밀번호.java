
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
        DNA 문자열 : 모든 문자열에 등장하는 문자가 'A', 'C', 'G', 'T'인 문자열
        "ACKA"는 아님 / "ACCA"는 맞음
        임의의 DNA문자열을 만들고 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이어야 비밀번호로 사용 가능

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); // dna문자열 길이
        int p = Integer.parseInt(st.nextToken()); //부분 문자열 길이

        char[] dna = br.readLine().toCharArray();//민호가 만든 dna 문자열
        int[] chk = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            chk[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;

        int[] count = new int[4];
        for(int i=0; i<p; i++){
            if(dna[i]=='A'){
                count[0]++;
            }else if(dna[i]=='C'){
                count[1]++;
            }else if(dna[i]=='G'){
                count[2]++;
            }else if(dna[i]=='T'){
                count[3]++;
            }
        }
        // 비밀번호 후보
        for (int i = 0; i <= s-p; i++) {
            boolean flag = false;
            // 조건에 부합하는지 확인
            for(int j=0; j<4; j++) {
                if(count[j] < chk[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) // 사용 가능한 비밀번호
                answer++;
            if(i==s-p) break;

            count[position(dna[i])]--;  //맨 앞 문자 제거
            count[position(dna[i+p])]++;  //뒤 문자 추가
        }
        br.close();
        System.out.println(answer);
    }
    // 각 문자의 위치를 확인
    private static int position(char alph) {
        switch(alph) {
            case 'A' : return 0;
            case 'C' : return 1;
            case 'G' : return 2;
            case 'T' : return 3;
        }
        return -1;
    }
}

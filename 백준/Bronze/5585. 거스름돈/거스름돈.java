import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] coinType = {500, 100, 50, 10, 5, 1};
        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0; //잔돈 개수
        for(int coin: coinType){
            count += money/coin;
            money %= coin;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}

n = int(input())
d = [0]*(n+1)

for i in range(2, n+1):
    d[i] = d[i-1]+1
    if i%3==0:
        d[i] = min(d[i], d[i//3]+1)
    if i%2==0:
        d[i] = min(d[i], d[i//2]+1)
print(d[n])

"""

import java.io.*;
import java.util.*;
public class Main {
    static int[] d;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        d = new int[n+1];
        for(int i=2; i<=n; i++){
            d[i] = d[i-1] + 1;
            if(i%3==0){
                d[i] = Math.min(d[i], d[i/3]+1);
            }
            if(i%2==0){
                d[i] = Math.min(d[i], d[i/2]+1);
            }
        }
        br.close();
        System.out.println(d[n]);
    }
}

"""
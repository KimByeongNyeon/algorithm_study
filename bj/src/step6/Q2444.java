package step6;

import java.io.*;

public class Q2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        //n가 5일 경우
        for(int i = 1; i < n+1; i++) { //i는 1 > 2 > 3 > 4 > 5
            for(int j = 1; j <= n-i; j++) { //j는 4 > 3 > 2 > 1 > 0
                bw.write(" "); // 1번째는 4번 반복, 2번째는 3번 반복, 3번째는 2번 반복 ...
            }//end for
            for(int j = 1; j <= 2*i-1; j++) { //j는 1 > 3 > 5 > 7 > 9
                bw.write("*"); // 1번째는 1번 반복, 2번째는 3번 반복, 3번쨰는 5번 반복 ...
            }//end for
            bw.write("\n"); //번째가 끝날때 마다 줄바꿈
        }//end for
        for(int i = 1; i <= n-1; i++) { //i는 1 > 2 > 3 > 4
            for(int j = 1; j <= i; j++) { //j는 1 > 2 > 3 > 4
                bw.write(" ");
            }//end for
            for(int j = 1; j <= ((n-i)*2-1); j++) { //j는 7 > 5 > 3 > 1
                bw.write("*"); //j는 7 > 5 > 3 > 1
            }//end for
            bw.write("\n");
        }//end for
        bw.flush();

    }//main
}//class

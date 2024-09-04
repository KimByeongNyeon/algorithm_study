package step3;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        //t가 3일 경우
        for(int i = 1; i < t+1; i++) { //i는 1 > 2 > 3
            for(int j = t-i; j > 0; j--) { //j는 2 > 1 > 0
                bw.write(" "); // 1번째는 2번 반복, 2번째는 1번 반복, 3번째는 0번 반복
            }//end for
            for(int k = 1; k < i+1; k++) { //k는 1 > 2 > 3
                bw.write("*"); // 1번째는 1번 반복, 2번째는 2번 반복, 3번쨰는 3번 반복
            }
            bw.write("\n"); //번째가 끝날때 마다 줄바꿈
        }//end for
        bw.flush();

    }//main
}//class

package step3;

import java.io.*;

public class Q2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            sb.append("*");
            bw.write(sb + "\n");
        }//end for
        bw.flush();

    }//main
}//class

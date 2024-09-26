package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수
        int count = Integer.parseInt(br.readLine());

        //반복
        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < num; k++) {
                    System.out.print(str.charAt(j));
                }//end for
            }//end for
            System.out.println();
        }//end for

        br.close();
    }//main
}//class

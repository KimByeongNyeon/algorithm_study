package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //2차원 배열 생성
        int[][] arr = new int[100][100];

        for(int i = 0; i < num; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    arr[j][k] = 1;
                }//end for
            }//end for
        }//end for

        int square = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                square += arr[i][j];
            }//end for
        }//end for
        System.out.println(square);
    }//main
}//class

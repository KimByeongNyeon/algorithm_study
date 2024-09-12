package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //배열 생성
        int[] arr = new int[31];

        //28번 반복
        for(int i = 1; i < 29; i++) {
            int num = Integer.parseInt(br.readLine());

            //배열 초기값
            arr[num] = 1;

        }//end for

        //없는 숫자 찾기
        for(int j = 1; j < 31; j++) {
            if (arr[j] != 1) {
                System.out.println(j);
            }//end if
        }
    }//main
}//class

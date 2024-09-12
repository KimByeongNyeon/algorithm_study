package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //배열
        int[] arr = new int[10];

        //10번 반복
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            arr[i] = num % 42;
        }//end for

        int count = 0;
        boolean temp;

        //반복문 숫자 비교하기
        for(int i = 0; i < 10; i++) {
            temp = false;
            for(int j = i + 1; j < 10; j++) {
                if(arr[i] == arr[j]) {
                    temp = true;
                    break;
                }//end if
            }//end for
            if(!temp) {
                count++;
            }
        }//end for

        System.out.println(count);

    }//main
}//class

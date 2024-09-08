package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9]; //배열 생성
        for(int i = 0; i < 9; i++) {
        int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }//end for

        int max = arr[0];
        int count = 0;

        for(int j = 1; j < 9; j++) {
            if(arr[j] > max) {
                max = arr[j];
                count = j;
            }//end if
        }//end for

        System.out.println(max);
        System.out.println(count+1);

    }//main
}//class

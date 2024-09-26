package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        //배열 생성
        int[] arr = new int[26];

        //초기 배열 값
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }//end for

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1) { //arr 배열의 값이 -1인 경우 -> 처음 등장한 경우만
                arr[ch - 'a'] = i; //문자가 처음 등장한 위치를 저장
            }//end if
        }//end for

        for(int i : arr) {
            System.out.print(i + " ");
        }//end for

    }//main
}//class

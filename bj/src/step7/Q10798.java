package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        int max = 0; //가장 긴 문자열 길이 저장

        for(int i = 0; i < arr.length; i++) {
            String str = br.readLine(); //한 줄 씩 입력
            if(max < str.length()) { //입력받은 문자열의 크기가 현재 max 보다 크면
                max = str.length(); //가장 긴 문자열의 길이로 변경
            }//end if

            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }//end for
        }//end for

        for(int i = 0; i < 15; i++) { //열 반복
            for(int j = 0; j < 5; j++) { //행 반복
                if(arr[j][i] == '\0') //빈 값이 있다면 건너뜀, char 배열의 빈 공간은 \0
                    continue;
                System.out.print(arr[j][i]); //세로로 문자 출력
            }//end for
        }//end for

    }//main
}//class

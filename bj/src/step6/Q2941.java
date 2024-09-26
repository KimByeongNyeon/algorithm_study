package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] ca = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; //크로아티아 배열

        int caCount = 0;

        //크로아티아 문자 개수 구하기
        for(int i = 0; i < ca.length; i++) {
            while (str.contains(ca[i])) { //크로아티아 문자가 문자열에 포함될 때까지 반복, contains는 문자열에 패턴이 포함되어있는지 여부만 확인
                str = str.replaceFirst(ca[i], "#"); //첫번째 일치항목만 대체, 그리고 반복
            }//end if
        }//end for

        //남은 알파벳 문자 개수 더하기
        System.out.println(str.length());

    }//main
}//class

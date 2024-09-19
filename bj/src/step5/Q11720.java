package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String longNum = br.readLine();

        int sum = 0;
        for(int i = 0; i < num; i++) {
            int oneNum = longNum.charAt(i) - '0'; //아스키코드 '0'을 빼서 실제 숫자로 변환
            /*
            문자 -> 숫자 변환 방법
            1. charAt(i) - '0' 아스키 코드를 숫자로 변환
            2. Character.getNumericValue(longNum.charAt(i)); 아스키 코드 신경 쓰지 않고 바로 정수 변환
            3. Integer.parseInt(String.valueOf(longNum.charAt(i))); 문자를 문자열로 변환 후 정수로 변환
             */
            sum += oneNum;
        }//end for

        System.out.println(sum);
    }//main
}//class

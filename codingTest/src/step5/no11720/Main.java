package step5.no11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //첫줄에서 숫자의 개수 N을 입력받음
        String a = in.next(); //둘째줄에서 숫자로 이뤄진 문자열을 입력받음
        in.close();

        int sum = 0;

        for(int i =0 ; i < N ; i++){
            sum += a.charAt(i)-'0'; //문자를 숫자로 변환하는 과정.0의 아스키 값은 48.
            //각 문자의 아스키 코드 값에서 '0'의 아스키 코드 값을 빼서 문자형 숫자를 정수형 숫자로 변환
        }
        System.out.println(sum);
    }
}

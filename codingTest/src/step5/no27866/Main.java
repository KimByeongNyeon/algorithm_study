package step5.no27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); //문자열 받기
        int i = Integer.parseInt(br.readLine())-1; //charAr()은 0부터 시작하기 때문

        br.close();

        System.out.println(s.charAt(i)); //i번째있는 글자 출력
    }
}

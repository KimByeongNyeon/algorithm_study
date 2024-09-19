package step2.no1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
* 주의 : 입력은 공백 한 칸으로 구분되어 두 정수가 주어짐
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); //readLine()은 한 행을 전부 읽기 때문에 공백 단위로 입력해
        //준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있음
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));


    }
}

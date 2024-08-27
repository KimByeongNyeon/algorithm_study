package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1000 {
    public static void main(String[] args) throws IOException { //BufferedReader사용으로 IOException
        /*
        BufferedReader : 문자를 효율적으로 읽어오는 클래스
        InputStreamReader : 바이트 스트림을 문자 스트림으로 변환
        System.in : 콘솔(키보드)에서 입력을 받는 스트림
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //사용자가 입력한 한 줄을 읽어들여 변수 str에 저장
        String str = br.readLine();

        //StringTokenizer : 문자열을 특정 구분자로 나눔
        StringTokenizer st = new StringTokenizer(str, " ");

        /*
        st.nextToken() : StringTokeninzer로 분리된 문자열 중 첫 번째 토큰을 가져옴
        Integer.parseInt() : 문자열을 숫자로 변환
         */
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
    }
}

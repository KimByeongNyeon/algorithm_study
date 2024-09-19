package step5.no9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트케이스 개수

        String name[] = new String[T]; //크기가 T인 문자열 배열 name 선언

        for(int i = 0 ; i < T ; i++){
            String str = br.readLine();
            name[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }//name 배열에 값을 저장하는 작업
        br.close();
        for(int i = 0 ; i < T ; i++){
            System.out.println(name[i]); //저장된 배열 name의 각 요소를 순차적으로 출력함
        }//배열에 저장된 값을 출력하는 작업
    }
}

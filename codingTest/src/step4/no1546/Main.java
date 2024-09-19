package step4.no1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력 스트림 설정 및 배열 크기 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];//첫줄에 입력된 문자열을 정수로 변환해 배열 arr의 크기로 설정

        //배열에 점수 저장
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Double.parseDouble(st.nextToken()); //각 토큰을 double형으로 바꾼 후 arr에 저장
        }
        Arrays.sort(arr);

        double sum = 0;

        for(int i =0; i < arr.length ; i++){
            sum+=((arr[i] / arr[arr.length - 1]) * 100);// arr[arr.length - 1])은 배열의 최고점수임
        }
        System.out.println(sum / arr.length);
    }
}

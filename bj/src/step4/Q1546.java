package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력 받기
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[count];

        //초기 배열 생성
        for(int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//end for

        //최대 구하기
        double max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }//end if
        }//end for

        //점수 고치기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
        }//end for

        //평균 구하기
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }//end for

        System.out.println(sum / count);
    }//main
}//class

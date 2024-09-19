package step4.no10818;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken()); //정수릐 개수 N
//
//        st = new StringTokenizer(br.readLine());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //1줄.입력받을 정수의 개수 N
        //1줄에서는 공백으로 구분된 여러 값을 처리할 필요없기 때문에 토크나이저 안씀
        StringTokenizer st = new StringTokenizer(br.readLine()," "); //2줄.공백으로 구분된 N개의 정수
            //StringTokenizer는 입력된 문자열을 공백을 기준으로 토근화 시킴

        int index = 0; //index 변수는 배열의 인덱스를 관리
        int[] arr = new int[N]; //크기가 N인 정수 배열 arr 선언. 입력된 정수를 저장함.
        while(st.hasMoreTokens()) { //객체 st에 "더 많은 토큰"이 남아있는 동안 반복함
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr); //배열을 오름차순 정렬
        System.out.print(arr[0] + " " + arr[N - 1]); //첫번째 원소는 가장 작은값, 마지막은 큰값

    }
}

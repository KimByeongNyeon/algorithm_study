package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //배열 크기
        int arr[] = new int[N]; //N에 배열 선언

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr); //오름차순 정렬
        System.out.print(arr[0] + " " + arr[N - 1]);


    }
}

package step4;

import java.io.*;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //배열 정하기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //배열 생성
        int[] arr = new int[n];

        //배열 초기값
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }//end for

        //m번 반복
        for(int j = 1; j < m+1; j++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }//end for

        //새 배열
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }//end for

    }//main
}//class

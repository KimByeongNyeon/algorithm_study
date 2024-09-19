package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //초기 바구니
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }//end for


        //m번 반복
        int temp = 0;
        for(int x = 0; x < m; x++) {
            st = new StringTokenizer(br.readLine()); //한 줄 입력

            int i = Integer.parseInt(st.nextToken()) - 1; //인덱스 기준
            int j = Integer.parseInt(st.nextToken()) - 1; //인덱스 기준

            while (i < j) { //i가 j보다 작을 때 까지만
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }//while
        }//end for

        //바구니 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }//end for
    }//main
}//class

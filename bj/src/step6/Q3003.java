package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr1 = {1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }//end for

        int temp;
        for(int i = 0; i < arr2.length; i++) {
            temp = arr2[i];
            arr2[i] = arr1[i]-temp;
            System.out.print(arr2[i] + " ");
        }//end for
    }//main
}//class

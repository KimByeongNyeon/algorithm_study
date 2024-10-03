package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index1 = 0;
        int index2 = 0;

        int[][] arr = new int[9][9];

        for(int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    index1 = i + 1;
                    index2 = j + 1;
                } else if (max == 0) { //최대값이 0일때
                    index1 = 1;
                    index2 = 1;
                }//end if
            }//end for
        }//end for

        System.out.println(max);
        System.out.println(index1 + " " + index2);

    }//main
}//class

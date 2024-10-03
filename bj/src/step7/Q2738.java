package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] arr2 = new int[2 * n][m];

        for(int i = 0; i < arr2.length; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            for(int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }//end for
        }//end for

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr2[i][j] + arr2[n+i][j];
                System.out.print(arr[i][j] + " ");
            }//end for
            System.out.println();
        }//end for
    }//main
}//class

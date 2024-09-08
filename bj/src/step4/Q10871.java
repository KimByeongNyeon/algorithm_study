package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }//end for

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n; j++) {
            if(arr[j] < x) {
                sb.append(arr[j]).append(" ");
            }//end if
        }//end for

        System.out.println(sb.toString());

    }//main
}//class

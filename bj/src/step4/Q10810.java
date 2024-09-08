package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st1.nextToken());
        int count = Integer.parseInt(st1.nextToken());

        int[] arr = new int[num];

        for(int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            int z = Integer.parseInt(st2.nextToken());

            for(int j = x-1; j < y; j++) {
                arr[j] = z;
            }//end for
        }//end for

        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < arr.length; k++) {
            sb.append(arr[k]).append(" ");
        }//end for

        System.out.println(sb.toString().trim());

    }//main
}//class

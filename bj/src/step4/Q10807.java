package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }//end for

        int countNum = Integer.parseInt(br.readLine());
        int count = 0;

        for(int j = 0; j < num; j++) {
            if(arr[j] == countNum) {
                count++;
            }//end if
        }//end for

        System.out.println(count);

    }//main
}//class

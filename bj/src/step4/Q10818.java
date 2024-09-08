package step4;

import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[num];

        for(int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(st.nextToken());
        }//end for

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }//end if
            if(arr[i] < min) {
                min = arr[i];
            }//end if
        }//end for
        System.out.print(min + " " + max);
    }//main
}//class

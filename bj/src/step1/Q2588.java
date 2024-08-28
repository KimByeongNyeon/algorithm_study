package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();

        char[] arr = num2.toCharArray();
        int a = Integer.parseInt(String.valueOf(arr[0]));
        int b = Integer.parseInt(String.valueOf(arr[1]));
        int c = Integer.parseInt(String.valueOf(arr[2]));

        System.out.println(num1 * c);
        System.out.println(num1 * b);
        System.out.println(num1 * a);
        System.out.println(num1 * Integer.parseInt(num2));
    }//main
}//class

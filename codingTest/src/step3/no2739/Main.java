package step3.no2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        sc.close();
//
//        for(int i = 1; i<10;i++) {
//            System.out.println(a+" * "+i+" = "+(a*i));
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i<10;i++) {
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}

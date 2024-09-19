package step1.no10926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        String lastString = "??!";
//
//        String x = sc.next();
//        System.out.println(x + lastString);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";

        String s = br.readLine();
        System.out.println(s + lastString);
    }
}

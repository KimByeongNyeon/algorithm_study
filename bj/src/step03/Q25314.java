package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = n/4;

        for(int i = 0; i < result; i++) {
            System.out.print("long ");
        }//end for

        System.out.print("int");
    }//main
}//class

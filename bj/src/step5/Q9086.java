package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            String word = br.readLine();
            int length = word.length();
            System.out.println(word.substring(0,1) + word.substring(length-1, length));
        }//end for
    }//main
}//class

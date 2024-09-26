package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int i = 0;
        int j = s.length() - 1;

        int result = 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                result = 0;
                break;
            }//end if
            i++;
            j--;
        }//end while
        System.out.println(result);
    }//main
}//class

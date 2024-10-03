package step6.no10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        StringBuffer sb = new StringBuffer(st);
        String reverse = sb.reverse().toString();

//        String world ="";
//        System.out.println(reverse);
        if(st.equals(reverse) ){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

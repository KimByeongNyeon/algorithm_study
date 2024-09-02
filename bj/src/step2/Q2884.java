package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        if(h > 0 && h < 24) {
//            if (m < 45) {
//                System.out.print((h - 1) + " " + (m + 15));
//            }
//            if (m >= 45) {
//                System.out.print(h + " " + (m - 45));
//            }
//        }//end if
//
//        if(h == 0) {
//            if(m < 45){
//                System.out.print((24-1) + " " + (m+15));
//            }if(m >= 45) {
//                System.out.print(h + " " + (m-45));
//            }//end if
//        }//end if

        if(m < 45) {
            h--;
            m = m+15;
            if(h < 0) {
                h = 23;
            }//end if
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m-45));
        }//end if
    }//main
}//class
package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null && !str.isEmpty()) { //EOF 처리
            StringTokenizer st = new StringTokenizer(str);
            
            if(st.countTokens() >= 2) { //토큰이 2개 이상일 경우에만 처리
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                System.out.println(a + b);
            }//end if
        }//end while
    }//main
}//class

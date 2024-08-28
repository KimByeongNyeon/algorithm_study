package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String id = st.nextToken();

        if(id.length() < 51) {
            char[] arr = id.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                if (Character.isLowerCase(arr[i])) {
                    sb.append(arr[i]);
                } else {
                    sb = null;
                }//end if
            }//end for
            if(sb != null) {
                System.out.println(sb.toString() + "??!");
            } else {
                System.out.println("소문자가 아닌 글자가 포함되어 있습니다.");
            }
        } else {
            System.out.println("50글자 이하로 입력해 주세요.");
        }//end if
    }//main
    
}//class

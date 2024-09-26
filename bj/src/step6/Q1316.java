package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = num; //단어의 개수

        for(int i = 0; i < num; i++) {
            String str = br.readLine();

            //이전 문자와 지금 문자가 같은지 비교
            int prev = 0;

            int[] alphabet = new int[26];

            for (int j = 0; j < str.length(); j++) {
                int now = str.charAt(j); //now는 문자열에서 j번째 문자

                if (prev != now) { //만약 이전문자가 지금 문자랑 다르다면
                    if (alphabet[now - 'a'] == 0) { //문자가 한번도 나온적이 없다면
                        alphabet[now - 'a']++; //더해줌
                        prev = now; //이전문자는 지금 문자로 변경
                    } else { //문자가 나온적이 있다면
                        count--; //그룹단어가 아니므로 빼줌
                        break; //이 단어는 끝나고 다음 단어로 넘어감
                    }//end if
                }//end if
            }//end for
        }//end for
        System.out.println(count);
    }//main
}//class

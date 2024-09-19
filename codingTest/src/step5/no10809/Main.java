package step5.no10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = -1; //-1로 초기화
        }

        String S = br.readLine();

        for(int i = 0 ; i <S.length() ; i++){
            char ch = S.charAt(i);
            //charAt() 메소드 사용해 문자 추출한 뒤 문자열 s에서 i번째 문자를 추출해 ch에 저장

            if(arr[ch - 'a'] == -1) { //해당 알파벳이 처음 등장한 경우에만 처리
                arr[ch - 'a'] = i; //ch - 'a'는 현재 문자가 배열 arr의 몇번째 인덱스에
                //있는지 계산. 'a'=97
            }
        }

        for(int val : arr){ //배열 출력
            System.out.print(val + " ");
        }
    }
}

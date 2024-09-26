package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase(); //모두 대문자로 변환

        char[] arr = new char[26]; //알파벳 갯수만큼 배열 생성

        //알파벳 개수 구하기
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'A'; //A(65)를 빼서 인덱스로 변환
            arr[index] += 1; //해당하는 인덱스에 +1
        }//end for

        //최대개수를 가진 알파벳 구하기
        int max = 0; //최대빈도
        int maxIndex = 0; //최대빈도의 인덱스
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) { //알파벳의 빈도가 max보다 크면
                max = arr[i]; //최대빈도는 그 알파벳의 빈도
                maxIndex = i; //최대빈도의 인덱스
            }//end if
        }//end for

        //최대개수를 가진 알파벳이 여러개 있는지 확인하기
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]) { //최대빈도수와 같은 알파벳의 개수 구하기
                count++;
            }//end if
        }//end for

        //최대빈도와 같은 알파벳의 개수가 여러개 일 경우와 그렇지 않을 때 출력
        if(count >= 2) {
            System.out.println('?'); //2개 이상일 경우 물음표 출력
        } else {
            System.out.println((char)(maxIndex + 'A')); //최대빈도의 알파벳의 인덱스를 아스키코드에서 문자로 바꿔 출력
        }//end if
    }//main
}//class

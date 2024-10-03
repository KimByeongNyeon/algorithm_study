package step6.no1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            if(65 <= s.charAt(i) && s.charAt(i) <=90) { //대문자 범위
                arr[s.charAt(i) - 65]++; //해당 인덱스의 값 1 증가
            }
            else{
                arr[s.charAt(i) - 97]++; //소문자 범위
            }
        }

        int max = -1;
        char ch = '?';

        for(int i =0; i<26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if(arr[i]==max){
                ch='?';
            }
        }
        System.out.println(ch);
    }
}

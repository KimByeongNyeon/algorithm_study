package step4.no3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        HashSet<Integer> h = new HashSet<Integer>();
//        //값을 넣을 때 만약 중복되는 값이 없으면 HashSet에 저장되면서 True 반환,
//        //중복되어 저장되지 않으면 false 반환
//        for (int i = 0 ; i < 10 ; i++){
//            h.add(in.nextInt() % 42);
//            //입력받은 값의 나머지 값을 add 메소드를 통해 HashSet에 저장
//        }
//        in.close();
//        System.out.println(h.size()); //저장된 원소의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i =0 ; i < 10; i++){
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
    }
}

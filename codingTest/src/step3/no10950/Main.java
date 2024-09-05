package step3.no10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int arr[] =new int[c];

        for(int i=0; i<c; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }//향상된 for문 다시 공부하기
    }
}

package step1.no11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //받는 숫자가 int형보다 큰 값을 출력하므로 long형(8byte)을 사용하여 출력함
//        int A=sc.nextInt();
//        int B=sc.nextInt();
//        int C=sc.nextInt();

        long A=sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();

        System.out.println(A+B+C);
    }
}

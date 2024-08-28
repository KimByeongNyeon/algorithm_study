package step1.no1008;

import java.util.Scanner;
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.printf("%.9f%n",A / B);

        scanner.close();
    }
}

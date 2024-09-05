package step3.no25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());//총 금액
        int N = Integer.parseInt(br.readLine());//물건 종류 수

        int totalPay = 0;//가격*개수

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());//가격
            int b= Integer.parseInt(st.nextToken());//물건 개수

            totalPay += (a*b); //가격*개수를 총합에 더함
        }

        if(totalPay == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        br.close();

    }
}

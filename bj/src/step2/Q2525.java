package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(str);

        int finalM = m + time;

        //분이 더해졌을 때 60분이 넘지 않을 경우
        if(finalM / 60 < 1) {
            System.out.println(h + " " + finalM);

        }else { //분이 더해졌을 때 60분이 넘을 경우
            h = h + finalM/60; //시 구하기
            finalM = finalM - 60*(finalM/60); //분 구하기

            if(h > 23) { //시가 23시를 넘을 경우
                h = h - 24;
            }//end if
            System.out.println(h + " " + finalM);
        }//end if
    }//main
}//class

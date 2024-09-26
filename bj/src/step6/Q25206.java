package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0; //총 점수
        double totalCredit = 0.0; //총 학점

        for(int i = 0; i < 20; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            String subject = st.nextToken(); //사용X
            double credit = Double.parseDouble(st.nextToken()); //학점
            String grade = st.nextToken(); //등급

            double score = 0.0; //학점 * 등급

            if(!grade.equals("P")) {
                switch (grade) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }//end switch

                totalScore += (score * credit);
                totalCredit += credit;

            }//end if

        }//end while

        System.out.printf("%.6f", totalScore / totalCredit);
        br.close();

    }//main
}//class

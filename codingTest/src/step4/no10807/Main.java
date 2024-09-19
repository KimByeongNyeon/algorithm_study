package step4.no10807;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        int N = Integer.parseInt(br.readLine()); //정수의 개수 N
        int[] arr = new int[N]; //크기가 N인 배열 선언. 사용자가 입력한 정수들을 저장

        //버퍼로 입력받고 토크나이저로 공백까지 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        //정수를 배열에 저장
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());//stringTokenizer에서 하나씩
            //토큰(즉, 분리된 정수)을 가져와서, 이를 정수로 변환하여 배열 arr에 저장.
        }

        int v = Integer.parseInt(br.readLine()); //찾으려는 정수 v
        int count = 0; //정수 v가 배열에 몇 번 나오는지 셀 때 변수. 변수 초기화

        //찾으려고 하는 정수 v와 배열 원소 하나씩 비교
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] == v){
                count++; //배열의 원소가 v와 같으면 count를 1 증가시킴
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count+"\n");

//        bw.flush(); //flush는 close를 호출하면 자동으로 처리되므오 생략 가능
        bw.close();
        br.close();

    }
}

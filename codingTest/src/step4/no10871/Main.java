package step4.no10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); //첫째줄
        int N = Integer.parseInt(st.nextToken()); //정수 개수 N개
        int X = Integer.parseInt(st.nextToken()); //기준이 되는 정수 x
//        int[] arr = new int[N];

        //두 번째 줄에서 수열 A를 입력받고 x보다 작은 값만 출력
        st = new StringTokenizer(br.readLine()); //둘쩨 줄. 수열 A 입력
        int[] arr = new int[N];

        //정수를 배열에 저장
        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
//        for(int i = 0 ; i < N ; i++){
//            int value = Integer.parseInt(st.nextToken()); //각 수열의 값을 읽음
//            if(value < X){
//                bw.write(value + " ");
//            }
//        }



        //X보다 작은 수만 출력
        for(int i=0 ; i<N ; i++){
            if(arr[i] < X){
                bw.write(arr[i]+" ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

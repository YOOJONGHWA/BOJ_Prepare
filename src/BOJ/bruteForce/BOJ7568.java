package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine()); // 전체 사람의 수 N 입력
//        int[][] people = new int[N][2]; // 각 사람의 정보를 담을 배열
//
//        // 각 사람의 정보를 입력받아 배열에 저장
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            people[i][0] = Integer.parseInt(st.nextToken()); // 몸무게 입력
//            people[i][1] = Integer.parseInt(st.nextToken()); // 키 입력
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        // 각 사람에 대해 덩치 등수 계산
//        for (int i = 0; i < N; i++) {
//            int rank = 1; // 초기 덩치 등수는 1로 설정
//            for (int j = 0; j < N; j++) {
//                // 자신보다 큰 덩치의 사람이 있다면 덩치 등수 증가
//                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
//                    rank++;
//                }
//            }
//            // 덩치 등수 문자열에 추가
//            sb.append(rank).append(" ");
//        }
//
//        // 결과 출력
//        System.out.println(sb);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());
        int[][] arr = new int[person][2];
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}

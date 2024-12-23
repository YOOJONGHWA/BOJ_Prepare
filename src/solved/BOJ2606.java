package solved;

import java.io.*;
import java.util.*;

public class BOJ2606 {

//    static int[][] network; // 연결 정보를 저장할 배열
//    static boolean[] visited; // 방문 여부 확인
//    static int count = 0; // 감염된 컴퓨터 수
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
//        int m = Integer.parseInt(br.readLine()); // 연결 쌍의 수
//
//        network = new int[n + 1][n + 1]; // 컴퓨터 연결 정보를 저장할 배열
//        visited = new boolean[n + 1]; // 방문 여부를 확인할 배열
//
//        // 연결 정보 입력
//        for (int i = 0; i < m; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            network[a][b] = 1;
//            network[b][a] = 1;
//        }
//
//        // DFS 탐색 시작
//        dfs(1);
//
//        // 결과 출력 (1번 컴퓨터 제외)
//        System.out.println(count - 1);
//    }
//
//    static void dfs(int node) {
//        visited[node] = true; // 현재 노드 방문
//        count++; // 감염된 컴퓨터 수 증가
//
//        for (int i = 1; i < network.length; i++) {
//            if (network[node][i] == 1 && !visited[i]) { // 연결되어 있고 방문하지 않았다면
//                dfs(i); // 재귀 호출
//            }
//        }
//    }

    static int[][] arr;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N +1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(1);
        System.out.println(count - 1);
    }

    private static void dfs(int node) {

        visited[node] = true;
        count++;

        for (int i = 1; i < arr.length; i++) {
            if (arr[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }

    }

}

package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16173 {

    static int[][] arr;
    static boolean[][] visited;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(dfs(0, 0) ? "HaruHaru" : "Hing");
    }

    private static boolean dfs(int row, int col) {
        if (row >= n || col >= n || visited[row][col]) return false;
        if (arr[row][col] == -1) return true;

        visited[row][col] = true;
        int jump = arr[row][col];

        return dfs(row + jump, col) || dfs(row, col + jump);
    }
}

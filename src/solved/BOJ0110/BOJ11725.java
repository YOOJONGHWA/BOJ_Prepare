package solved.BOJ0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11725 {

    static ArrayList<Integer>[] tree;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        arr = new int[n + 1];

        DFS(1, 0);

        for (int i = 2; i <= n; i++) {
            System.out.println(arr[i]);
        }

        br.close();
    }

    private static void DFS(int current, int p) {

        arr[current] = p;

        for (int next : tree[current]) {
            if (next != p) {
                DFS(next, current);
            }
        }

    }

}

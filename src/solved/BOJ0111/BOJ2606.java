package solved.BOJ0111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2606 {

    static ArrayList<Integer>[] computer;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comCount = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());

        computer = new ArrayList[comCount + 1];
        visited = new boolean[comCount + 1];

        for (int i = 1; i <= comCount; i++) {
            computer[i] = new ArrayList<>();
        }

        for (int i = 0; i < connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computer[a].add(b);
            computer[b].add(a);
        }

        int infectedCount = checkVirus(1) - 1;
        System.out.println(infectedCount);
    }

    private static int checkVirus(int virus) {

        visited[virus] = true;
        int count = 1;

        for (int com : computer[virus]) {
            if (!visited[com]) {
                count += checkVirus(com);
            }
        }

        return count;

    }

}

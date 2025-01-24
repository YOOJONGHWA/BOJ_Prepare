package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int[] traps = new int[width];
        for (int i = 0; i < width; i++) {
            traps[i] = Integer.parseInt(br.readLine());
        }

        int[] bugs = new int[height + 1];
        for (int i = 1; i <= height; i++) {
            bugs[i] = i;
        }

        int totalCrush = Integer.MAX_VALUE;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {

            int crushDown = 0;
            int crushUp = 0;
            for (int j = 0; j < width; j++) {

                if(j % 2 == 0) {
                    if(bugs[i] <= traps[j]) {
                        crushDown++;
                    }
                }
                else {
                    if(bugs[i] >= traps[j]) {
                        crushUp++;
                    }
                }
            }

            int temp = crushDown + crushUp;

            if (totalCrush == temp) {
                count += 2;
            }

            if (totalCrush > temp) {
                totalCrush = temp;
            }

        }

        sb.append(totalCrush).append(" ").append(count);
        System.out.println(sb.toString());
    }
}

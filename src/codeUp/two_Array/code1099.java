package codeUp.two_Array;

import java.util.Scanner;

public class code1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[10][10];

        // 미로 입력 받기
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        // 시작 위치 (2, 2)
        int x = 1, y = 1;

        // 개미의 이동
        while (true) {
            // 현재 위치를 9로 표시
            maze[x][y] = 9;

            // 먹이를 찾은 경우도 9로 표시하고 종료
            if (maze[x][y] == 2) {
                break;
            }

            // 오른쪽으로 이동 가능한 경우
            if (maze[x][y + 1] == 0) {
                y++;
            }
            // 아래로 이동 가능한 경우
            else if (maze[x + 1][y] == 0) {
                x++;
            }
            // 더 이상 이동할 수 없는 경우 종료
            else {
                break;
            }
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 먹이의 위치인 2도 9로 출력
                if (maze[i][j] == 2) {
                    System.out.print(9 + " ");
                } else {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}



package BOJ.advanced;

import java.util.Scanner;

public class BOJ2444 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    아침 늦게 일아나서
//    ㅠㅠㅠㅠㅠㅠㅠㅠㅠ 흐규흐규
//    컴퓨터 강의만 들으시는 건가요?
//    재밌나요?
//    아니라고 답변 ㅇㅋ
//    몇시 까지?
//    상담병 출신 이라 ... ㅋㅋ
//    이것저것 많이 했습니다 ㅠㅠㅠㅠㅠㅠ
//    수면 패턴 일정 않으신거네요 ?
//    몸관리 잘되시는 거 같앙 ㅛㅠㅠ
//    흐규 흐규
//    노파심에 틀딱 하면 허리 젋을때 관리 잘하셔야 됩니다 ㅠㅠ
//    디스크 진짜 친오빠 마음으로 강조!
//    상담 ? 음?
//    이 알람 노래 군대 기상노래를 추천 하는데 제가 들려드려 도 괜찮을까요?
//
//    기상청 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//    조항요 vㅠㅠㅠㅠㅠㅠ 봉인된  ???? 어헝?
//    그건 진실이 아니에요 ㅋㅋㅋㅋ
//    그건 진
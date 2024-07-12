package codeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {
        // 덱 생성
        List<String> deck = createDeck();
        // 덱 섞기
        Collections.shuffle(deck);

        // 테스트 출력
        for (String card : deck) {
            System.out.print(card + " ,");
        }
        System.out.println();

        // 플레이어 수
        int playerCount = 2;

        // 카드 분배
        List<List<String>> players = chooseCards(deck, playerCount, 5);

        // 각 플레이어의 정렬된 카드 출력과 카드 숫자 합계 계산

        int[] sum = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            List<String> playerCards = players.get(i);
            sortCards(playerCards); // 플레이어 카드 정렬
            for (String card : playerCards) {
                sum[i] += extractNumber(card);
            }
            System.out.println("플레이어 " + (i + 1) + "의 카드: " + players.get(i) + ", 합계 : " + sum[i]);
        }
        System.out.println();

        // 결과 출력
        if (sum[0] > sum[1]) {
            System.out.println("플레이어 1이 승리하였습니다!");
        } else if (sum[0] < sum[1]) {
            System.out.println("플레이어 2가 승리하였습니다!");
        } else {
            System.out.println("무승부입니다!");
        }

    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();

        // 카드 추가
        String[] suits  = {"♠", "♥", "♦", "♣"};
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                deck.add(i + "(" + suit + ")");
            }
        }
        return deck;
    }

    private static List<List<String>> chooseCards(List<String> deck, int playerCount, int maxCard) {
        List<List<String>> players = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            players.add(new ArrayList<>());
        }

        for (int cardIndex = 0; cardIndex < maxCard; cardIndex++) {
            for (int playerIndex = 0; playerIndex < playerCount; playerIndex++) {
                players.get(playerIndex).add(deck.remove(0));
            }
        }
        return players;
    }

    private static void sortCards(List<String> playerCards) {
        Collections.sort(playerCards, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                // 카드 숫자 추출
                int num1 = extractNumber(card1);
                int num2 = extractNumber(card2);

                // 카드 숫자가 같으면 스트링 값으로 비교
                if (num1 == num2) {
                    return card1.compareTo(card2);
                }
                // 숫자 기준 오름차순 정렬
                return Integer.compare(num1, num2);
            }

        });
    }
    private static int extractNumber(String card) {
        // 카드에서 숫자 부분 추출
        return Integer.parseInt(card.split("\\(")[0]);
    }
}

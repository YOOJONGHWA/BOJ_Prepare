package programmers.lv1;

class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total = price * i;
            answer += total;
        }
        if(answer < money) {
            answer = 0;
        }
        else {
            answer = answer - money;
        }
        return answer;
    }
    public static void main(String[] args) {

        부족한금액계산하기 sol = new 부족한금액계산하기();
        System.out.println(sol.solution(3,20,4));

    }
}
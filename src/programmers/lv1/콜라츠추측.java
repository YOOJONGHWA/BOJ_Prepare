package programmers.lv1;

class 콜라츠추측 {
    public int solution(int n) {
        long num = n;
        int answer = 0;
        while(num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
            }
            else {
                num = (num * 3) + 1;
            }
            answer++;
            if(answer >= 500) {
                answer = -1; // 500번을 초과하면 -1을 반환하고 종료
                break; // 반복문 종료
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 sol = new 콜라츠추측();
        System.out.println(sol.solution(626331)); // 출력: -1
    }
}


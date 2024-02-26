package programmers.lv1;

class 정수제곱근판별 {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        if(answer * answer == n) {
            answer = (answer + 1) * (answer + 1);
        }
        else {
            answer = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        정수제곱근판별 sol = new 정수제곱근판별();
        System.out.println(sol.solution(121));
        System.out.println(sol.solution(3));
    }
}

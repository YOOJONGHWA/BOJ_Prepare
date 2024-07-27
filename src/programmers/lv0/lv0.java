package programmers.lv0;

class Solution {
    public double solution(long balls, long share) {
        double answer = 0;

        double n = make(balls);
        double nm = make(balls - share);
        double m = make(share);

        System.out.println(n + " " + nm + " " + m);

        answer = n / (nm * m);

        return (int) answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 2));
        System.out.println(sol.solution(5, 3));
        System.out.println(sol.solution(10, 5));
        System.out.println(sol.solution(30, 30));
    }

    public static double make(long num) {
        double makeNum = 1;

        for (long i = 1; i <= num; i++) {
            makeNum *= i;
        }

        return makeNum;
    }
}
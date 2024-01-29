package programmers.lv2;

class Solution4 {
    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int asd : arr) {
            System.out.println(asd);
        }

        return answer;
    }

    public static void main(String[] args) {

        int num = 15;
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(num));

    }
}

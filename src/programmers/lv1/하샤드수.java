package programmers.lv1;

class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int[] arr = new int[str.length()];
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += arr[i];
        }
        answer = x % sum == 0 ? true : false;
        return answer;
    }
    public static void main(String[] args) {

        하샤드수 sol = new 하샤드수();
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(12));
        System.out.println(sol.solution(11));
        System.out.println(sol.solution(13));

    }
}

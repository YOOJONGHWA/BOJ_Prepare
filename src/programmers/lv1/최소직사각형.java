package programmers.lv1;

class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 0;
        int yMax = 0;
        for(int i = 0; i < sizes.length; i++) {
            xMax = Math.max(xMax, Math.max(sizes[i][0],sizes[i][1]));
            yMax = Math.max(yMax, Math.min(sizes[i][0],sizes[i][1]));
        }
        answer = xMax * yMax;
        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {60,50},
                {30,70},
                {60,30},
                {80,40},
        };
        최소직사각형 sol = new 최소직사각형();
        System.out.println(sol.solution(arr));
    }
}

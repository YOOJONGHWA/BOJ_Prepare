class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;

        for (int i = 0; i < lines.length; i++) {
            minStart = Math.min(minStart, lines[i][0]);
            maxEnd = Math.max(maxEnd, lines[i][1]);
        }

        int[] coverage = new int[maxEnd - minStart + 1];
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] - minStart;
            int end = lines[i][1] - minStart;
            for (int j = start; j < end; j++) {
                coverage[j]++;
            }
        }

        for (int i = 0; i < coverage.length; i++) {
            if (coverage[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}

class Solution {
    public int[] solution(int[][] score) {
        double[] averages = new double[score.length];
        int[] ranks = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            double sum = 0;
            
            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            averages[i] = sum / score[i].length;
        }
        for(int i = 0; i < score.length; i++) {
            
            int rank = 1;
            for(int j = 0; j < score.length; j++) {
                if(averages[j] > averages[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}
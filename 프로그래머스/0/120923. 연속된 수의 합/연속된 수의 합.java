class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        

        int findNum = (total - (num * (num - 1) / 2)) / num;
        
        for (int i = 0; i < num; i++) {
            answer[i] = findNum + i;
        }
        
        return answer;
    }
}

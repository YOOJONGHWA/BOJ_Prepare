class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a = common[0];
        int b = common[1];
        int c = common[2];
        
        // 등차수열
        if (b - a == c - b) {
            int diff = b - a; // 공차
            answer = common[common.length - 1] + diff;
        } 
        // 등비수열
        else {
            int ratio = b / a; // 공비
            answer = common[common.length - 1] * ratio;
        }
        
        return answer;
    }
}

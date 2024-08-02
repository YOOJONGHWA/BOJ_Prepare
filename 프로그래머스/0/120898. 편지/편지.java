class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;
        
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("happy birthday!"));
    }
}
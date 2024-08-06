class Solution {
    public int solution(int n) {
        int answer = 2;
        
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt) {
            System.out.println(sqrt + " " + (int)sqrt);
            answer = 1;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 1; 
        
        int gcd = 1;
        for(int i = 2; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        
        int reducedA = a / gcd;
        int reducedB = b / gcd;

        while (reducedB % 2 == 0) {
            reducedB /= 2;
        }
        while (reducedB % 5 == 0) {
            reducedB /= 5;
        }
        
        // 나누어 떨어진 후에 남은 수가 1이 아니라면 2와 5 외의 소수가 포함된 것
        if (reducedB != 1) {
            answer = 2;
        }

        return answer;
    }
}

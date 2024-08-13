class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int cupon = chicken;
        
        while(cupon > 9) {
            int service =  cupon / 10;
            answer += service;
            cupon =  cupon % 10 + service;
        }
        
        return answer;
    }
}
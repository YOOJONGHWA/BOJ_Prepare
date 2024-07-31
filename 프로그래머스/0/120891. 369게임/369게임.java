class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        int length = orderStr.length();

        for (int i = 0; i < length; i++) {
            char ch = orderStr.charAt(i); 
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }

        return answer;
    }
}
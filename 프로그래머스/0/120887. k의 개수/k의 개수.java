class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String target = String.valueOf(k);
        

        for (int a = i; a <= j; a++) {

            String current = String.valueOf(a);
            

            for (int b = 0; b < current.length(); b++) {
                if (current.substring(b, b + 1).equals(target)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

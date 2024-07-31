class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = code - 1; i < cipher.length(); i += code) {
            String secret = String.valueOf(cipher.charAt(i));
            sb.append(secret);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("dfjardstddetckdaccccdegk",4));
    }
}
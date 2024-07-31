class Solution {
    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = charArray[i];
            if(Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
            else {
                charArray[i] = Character.toLowerCase(c);
            }
            String invert = String.valueOf(charArray[i]);
            sb.append(invert);
        }
        
        return answer += sb;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("cccCCC"));
    }
}
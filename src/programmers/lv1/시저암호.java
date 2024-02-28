package programmers.lv1;

class 시저암호{
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                sb.append((char)('A' + (c - 'A' + n) % 26));
            }
            else if(Character.isLowerCase(c)) {
                sb.append((char)('a' + (c - 'a' + n) % 26));
            }
            else {
                sb.append(c);
            }
        }

        return answer += sb;
    }
    public static void main(String[] args) {
        시저암호 sol = new 시저암호();
        System.out.println(sol.solution("AB",1));
    }
}
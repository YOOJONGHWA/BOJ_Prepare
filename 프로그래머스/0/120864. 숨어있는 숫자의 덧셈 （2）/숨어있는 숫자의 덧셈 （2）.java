public class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String temp = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}

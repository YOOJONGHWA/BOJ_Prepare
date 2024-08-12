class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for (int j = 0; j < str.length; j++) {
                if (word.contains(str[j])) {
                    word = word.replace(str[j], " ");
                }
            }
            
            word = word.replace(" ", "");
            if (word.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}

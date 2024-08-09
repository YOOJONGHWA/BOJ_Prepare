class Solution {
    public int solution(String[] spell, String[] dic) {

        for (String word : dic) {
            boolean containsAll = true;
            for (String s : spell) {
                if (!word.contains(s)) {
                    containsAll = false;
                    break;
                }
            }
            if (containsAll) {
                return 1; 
            }
        }
        return 2; 
    }
}

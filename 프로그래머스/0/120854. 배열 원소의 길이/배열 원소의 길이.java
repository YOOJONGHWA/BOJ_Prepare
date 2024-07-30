class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {    
            answer[i] = strlist[i].length();    
        }
                
        return answer;
    }
    public static void main(String[] args) {
        String[] arr = {"We", "are", "the", "world!"};
        Solution sol = new Solution();
        System.out.println(sol.solution(arr));
    }
}
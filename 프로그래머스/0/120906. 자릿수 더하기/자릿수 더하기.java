class Solution {
    public int solution(int n) {
        int answer = 0;
        String N = String.valueOf(n);
        int length = N.length();
        int[] arr = new int[length]; 
        for(int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
            answer += arr[i];
        }
        
        return answer;
    }
}
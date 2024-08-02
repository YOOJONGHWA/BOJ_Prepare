class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int result = 0;
        
        String[] arr = my_string.split(" ");
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("+")) {
                result = Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i+1]);
                arr[i+1] = Integer.toString(result);
            } else if(arr[i].equals("-")) {
                result = Integer.parseInt(arr[i-1]) - Integer.parseInt(arr[i+1]);
                arr[i+1] = Integer.toString(result);
            }
            
            if(i == arr.length-1) {
                answer = Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}
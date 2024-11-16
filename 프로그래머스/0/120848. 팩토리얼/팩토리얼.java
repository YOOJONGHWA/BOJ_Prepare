/*

    0! = 1
    n! = n * (n-1)! > 0
    
*/

class Solution {
    
    public int solution(int n) {
        
        int answer = 0;
        int max = 0;
        
        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = factorial(i + 1);
            
        }
        
        for(int num : arr) {
            
            if(num <= n) {
                max = num;
                answer++;
                
            }
            
        }
        
        return answer;
    }
    
    public static int factorial(int k) {
        
        if(k <= 0) {
            return 1;
        }
        else {
            return k * factorial(k - 1);
        }
    }
}
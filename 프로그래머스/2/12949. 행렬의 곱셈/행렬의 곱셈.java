//         1 4     00 01       3 3     00 01       1 * 3 + 4 * 3 = 15 , 1 * 3 + 4 * 3 = 15
            
//         3 2     10 11       3 3     10 11       3 * 3 + 2 * 3 = 15 , 3 * 3 + 2 * 3 = 15
            
//         4 1     20 21                           4 * 3 + 1 * 3 = 15 , 4 * 3 + 3 * 1 = 15 
            
 
//         [0][0] * [0][0] + [0][1] * [1][0]
//         [0][0] * [0][1] + [0][1] * [1][1]
        
//         [1][0] * [0][0] + [1][1] * [1][0]
//         [1][0] * [0][1] + [1][1] * [1][1]
            
//         [2][0] * [0][0] + [2][1] * [1][0]
//         [2][0] * [0][1] + [2][1] * [1][1]
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
            
            for(int j = 0; j < arr2[0].length; j++) {
                
                for(int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
                
            }
            
        }
        
        
        return answer;
    }
}
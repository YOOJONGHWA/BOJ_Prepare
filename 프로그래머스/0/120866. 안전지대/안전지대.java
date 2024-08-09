class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        boolean[][] dangerZone = new boolean[n][n];
        
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0 , 1, 1, 1, 0, -1, -1};
        
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n; j++) {
                
                if(board[i][j] == 1) {
                    dangerZone[i][j] = true;
                    for(int k = 0; k < 8; k++) { 
                        
                        int x = i + dx[k];
                        int y = j + dy[k];
                        
                        if (x >= 0 && x < n && y >= 0 && y < n) {
                            dangerZone[x][y] = true;
                        }
                    }
                    
                }
                
            }
            
        }
        
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n; j++) {
                
                if(!dangerZone[i][j]) {
                    answer++;
                }
                
            }
            
        }
        
        return answer;
    }
}


// 25 - 8 - 1 = 16
// [0, 0, 0, 0, 0], 00 01 02 03 04
// [0, 0, 0, 0, 0], 10 11 12 13 14 
// [0, 0, 0, 0, 0], 20 21 22 23 24         32 - 21 = 1 1
// [0, 0, 1, 0, 0], 30 31 32 33 34         41 - 32 = 
// [0, 0, 0, 0, 0]] 40 41 42 43 44
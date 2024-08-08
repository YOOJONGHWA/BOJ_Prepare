class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int widthLimit = board[0] / 2;
        int heightLimit = board[1] / 2;
        int x = 0;
        int y = 0;
        
        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y < heightLimit) {
                        y += 1;
                    }
                    break;
                case "down":
                    if (y > -heightLimit) {
                        y -= 1;
                    }
                    break;
                case "left":
                    if (x > -widthLimit) {
                        x -= 1;
                    }
                    break;
                case "right":
                    if (x < widthLimit) {
                        x += 1;
                    }
                    break;
            }
        }

        return new int[] {x, y};
    }
    
}

class Solution {
    public int solution(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int lowLimit = bigValue - smallValue;
        int highLimit = bigValue + smallValue;

        return highLimit - lowLimit - 1;
    }
}

/*

최소값 : |a - b| + 1
최대값 : a + b -1
+1을 하는 이유는 시작점과 끝점을 모두 포함하기 위해서입니다.
*/
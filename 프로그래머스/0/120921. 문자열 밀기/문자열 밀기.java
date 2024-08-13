class Solution {
    public int solution(String A, String B) {
        int length = A.length();
        
        // 문자열 길이 확인
        if (length != B.length()) {
            return -1;
        }
        
        // 문자열 A가 B와 동일하면 0 반환
        if (A.equals(B)) {
            return 0;
        }
        
        // 문자열 A를 오른쪽으로 한 칸씩 밀면서 B와 비교
        for (int i = 1; i < length; i++) {
            // 마지막 문자와 나머지 부분을 분리
            char lastChar = A.charAt(length - 1);
            String str = A.substring(0, length - 1);
            A = lastChar + str;  // 문자열 업데이트
            
            // 새로운 문자열이 B와 같은지 확인
            if (A.equals(B)) {
                return i;
            }
        }
        
        // 밀어서 B와 같아지지 않는 경우
        return -1;
    }
}

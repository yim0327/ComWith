public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];  
        
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);  // x부터 시작해 x씩 증가하는 숫자를 배열에 저장
        }
        
        return answer; 
    }
    
}

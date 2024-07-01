class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; 
        int num = 1; 
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;
            
            for (int i = right; i >= left; i--) {
                answer[bottom][i] = num++;
            }
            bottom--;
            
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = num++;
            }
            left++;
        }
        return answer;
    }
}

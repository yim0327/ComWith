class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int max = Math.max(rows, cols);
        
        int[][] result = new int[max][max];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr[i][j];
            }
        }
        
        return result;
    }
}

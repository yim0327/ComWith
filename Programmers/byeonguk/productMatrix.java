class productMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;  //  arr1의 행의 길이
        int column1 = arr1[0].length;  //  arr1의 열의 길이
        int row2 = arr2.length;  //  arr2의 행의 길이
        int column2 = arr2[0].length;  //  arr2의 열의 길이

        int[][] answer = new int[row1][column2];  //  행렬의 곱셈 결과

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
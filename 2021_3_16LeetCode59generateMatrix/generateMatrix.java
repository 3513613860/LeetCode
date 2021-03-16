class Solution {
    public int[][] generateMatrix(int n) {
        int [][] array = new int [n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int k = 1;
        while(up <= down && left <= right){
            for(int i = up; i <= right && up <= right; i++){
                array[up][i] = k++;
            }
            up++;
            for(int i = up; i <= down && left <= right; i++){
                array[i][right] = k++;
            }
            right--;
            for(int i = right; i >= left && up <= down; i--){
                array[down][i] = k++;
            }
            down--;
            for(int i = down; i >= up && left <= right; i--){
                array[i][left] = k++;
            }
            left++;
        }
        return array;
    }
} 
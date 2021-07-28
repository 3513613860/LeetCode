class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int  size = r * c;
        int row = mat.length;
        int col = mat[0].length;
        int t = row * col;
        if(size != t){
            return mat;
        }
        int [] nums = new int [size];
        int k = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                nums[k++] = mat[i][j];
            }
        }

        k = 0;
        int [][] array = new int [r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array[i][j] = nums[k++];
            }
        }
        return array;
    }
}
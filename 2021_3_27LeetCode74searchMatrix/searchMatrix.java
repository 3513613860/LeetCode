class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int [] array= new int[matrix.length*matrix[0].length];
        int k = 0;
        //将二维矩阵转换为一维数组
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                array[k++] = matrix[i][j];
            }
        }

        //在一维数组中采用二分查找，查找目标值
        int i = 0;
        int j = k - 1;
        while(i <= j){
            int mid = (i+j)/2;
            if(array[mid] > target){
                j = mid-1;
            }else if(array[mid] < target){
                i = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
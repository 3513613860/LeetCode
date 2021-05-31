class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int [][] nums = new int[m][n];
        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            int k = 0;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] < min){
                    k = j;
                    min = matrix[i][j];
                }
            }
            nums[i][k] = 1;
        }

        for(int i = 0; i < n; i++){
            int max = matrix[0][i];
            int k = 0;
            for(int j = 1; j < m; j++){
                if(matrix[j][i] > max){
                    k = j;
                    max = matrix[j][i];
                }
            }
            if(nums[k][i] == 1){
                list.add(max);
            }
        }
        return list;
    }
}
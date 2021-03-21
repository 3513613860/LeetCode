class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] arr = new int [m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    int a = 0;
                    int b = 0;
                    while(a < n){
                        arr[i][a] = 0;
                        a++;
                    }

                    while(b < m){
                        arr[b][j] = 0;
                        b++;
                    }                    
                }
            }
        }


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}
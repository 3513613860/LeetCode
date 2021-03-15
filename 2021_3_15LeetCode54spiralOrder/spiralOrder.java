class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(up <= down && left <= right){
            for(int i = left; i <= right&& up <= down; i++){
                list.add(matrix[up][i]);
            }
            up++;
            for(int i = up; i <= down&& left <= right; i++){
                list.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left && up <= down; i--){
                list.add(matrix[down][i]);
            }
            down--;
            for(int i = down; i >= up && left <= right; i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // for (int i = 0; i < 9; i++) {
        //     Set<Integer> set1 = new HashSet<>();
        //     for (int j = 0; j < 9; j++) {
        //         if (board[i][j] == '.') {
        //             continue;
        //         }
        //         int temp = board[i][j] - 48;
        //         if (!set1.contains(temp) && temp >= 1 && temp <= 9) {
        //             set1.add(board[i][j] - 48);
        //         } else {
        //             return false;
        //         }
        //     }
        // }

        // for (int i = 0; i < 9; i++) {
        //     Set<Integer> set2 = new HashSet<>();
        //     for (int j = 0; j < 9; j++) {
        //         int temp2 = board[j][i] - 48;
        //         if (board[j][i] == '.') {
        //             continue;
        //         }
        //         if (!set2.contains(temp2) && temp2 >= 1 && temp2 <= 9) {
        //             set2.add(board[j][i] - 48);
        //         } else {
        //             return false;
        //         }
        //     }
        // }

        // for (int i = 0; i < 9; i++) {
        //     Set<Integer> set = new HashSet<>();
        //     int j = (i / 3) * 3;
        //     int k = (i % 3) * 3;
        //     int size1 = j + 3;
        //     int size2 = k + 3;
        //     for (j = (i / 3) * 3; j < size1; j++) {
        //         for (k = (i % 3) * 3; k < size2; k++) {
        //             if (board[j][k] == '.') {
        //                 continue;
        //             }
        //             int temp = board[j][k] - 48;
        //             if (!set.contains(temp) && temp >= 1 && temp <= 9) {
        //                 set.add(board[j][k] - 48);
        //             } else {
        //                 return false;
        //             }
        //         }
        //     }

        // }
        // return true;

        boolean [][] row = new boolean[9][9];
        boolean [][] col = new boolean[9][9];
        boolean [][] small = new boolean [9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j]-49;
                    int cur = i / 3 * 3 + j/3;
                    if(row[i][num] || col[j][num] || small[cur][num]){
                        return false;
                    }else{
                        row[i][num] = true;
                        col[j][num] = true;
                        small[cur][num] = true;
                    }
                }
            }
        }
        return true;
    }
}
class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 1 || numRows == 1){
            return s;
        }
        int row = numRows;
        int pre = s.length()/(numRows+numRows-2)*(1+numRows-2);
        int yu = s.length()%(numRows+numRows-2);
        if(yu > 0){
            int k =  yu>numRows? yu-numRows:0;
            yu = 1 +k;
        }
        int col = pre + yu;
        char [][] chars = new char[row][col];

        int k = 0;
        char [] array  = s.toCharArray();
        for(int j = 0; j < col; j++){
            for(int i = 0; i < row; i++){
                if(k == array.length){
                    break;
                }
                if(j == 0 || (j % (numRows-1)==0)){
                    chars[i][j] = array[k++];
                    continue;
                }
                if((i+j)%(numRows-1)==0){
                    chars[i][j] = array[k++];
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(chars[i][j] != '\u0000'){
                    sb.append(chars[i][j]+"");
                }
            }
        }
        return sb.toString();
    }
}
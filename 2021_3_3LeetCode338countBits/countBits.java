class Solution {
    public int[] countBits(int num) {
        //定义一个数组
        int [] array = new int [num+1];
        //遍历这个数组
        for(int i = 0; i <= num; i++){
            int m = i;
            int count = 0;
            //对每一个数字计算比特位数
            for(int j = 0; j <= 31; j++){
                if(((m >> j) & 1) == 1){
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}
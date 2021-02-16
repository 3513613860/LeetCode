class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        //遍历整个数组
        while(i < j){
            //从前往后找奇数
            while(i < j && A[i] % 2 == 0){
                i++;
            }
            //从后往前找偶数
            while(i < j && A[j] % 2 != 0){
                j--;
            }
            //进行交换
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
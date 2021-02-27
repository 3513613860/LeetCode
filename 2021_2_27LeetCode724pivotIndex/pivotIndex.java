class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        //获取数组总和
        for(int i = 0; i < nums.length; i++){
            sum1 = sum1 + nums[i];
        }

        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            //左边和+当前值 = 数组总和时，返回当前值的下标
            if(sum2 * 2 + nums[i] == sum1){
                return i;
            }
            sum2 = sum2 + nums[i];
        }
        return -1;
    }
}
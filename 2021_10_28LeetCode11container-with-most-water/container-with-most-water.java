class Solution {
    public int maxArea(int[] height) {
        //数组长度为0或者为1时，返回0
        if(height == null || height.length < 2){
            return 0;
        }
        //max为最终的结果
        int max = 0;

        //left和right为左右指针
        int left = 0;
        int right = height.length-1;
        while(left < right){
            //取左右中的较小值
            int min = Math.min(height[left],height[right]);
            //取max与当前计算的最大值
            max = Math.max(max,min*(right-left));
            //左边的值<右边的值，left++，否则right--
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
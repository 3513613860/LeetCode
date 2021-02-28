class Solution {
    public void sortColors(int[] nums) {
        quick(nums,0,nums.length-1);
    }
    public  int pivot(int [] nums,int start, int end){
        int temp = nums[start];
        while(start < end){
            while(start < end && nums[end] >= temp){
                end--;
            }
            nums[start] = nums[end];
            while(start < end && nums[start] <= temp){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = temp;
        return start;
    }

    public  void quick(int [] nums, int low, int high){
        if(low < high){
            int piv = pivot(nums,low,high);
            quick(nums,low,piv - 1);
            quick(nums,piv + 1,high);
        }
    }
}
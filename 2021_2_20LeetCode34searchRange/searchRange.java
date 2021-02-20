class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] array = new int [2];
        if(nums.length == 0){
            array[0] = -1;
            array[1] = -1;
            return array;
        }
        int left = 0;
        int right = nums.length-1;
        int i = 0;
        int j = 0;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                i = mid;
                j = mid;
                while(i >= 0 && nums[mid] == nums[i]){
                    i--;
                }
                i = i + 1;
                while(j < nums.length && nums[mid] == nums[j]){
                    j++;
                }
                j = j - 1;   
                array[0] = i;
                array[1] = j;
                return array;           
            }
        }
        array[0] = -1;
        array[1] = -1;
        return array;
    }
}
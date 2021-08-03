class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int [] array = Arrays.copyOf(nums,nums.length);
        Arrays.sort(array);
        int left = 0;
        int right = 0;
        for(int i = 0; i < nums.length; i++){
            if(array[i] != nums[i]){
                left = i;
                break;
            }
        }

        

        for(int i = nums.length-1; i >= 0; i--){
            if(array[i] != nums[i]){
                right = i;
                break;
            }
        }

        return (right-left+1) == 1 ? 0:right-left+1;
    }
}
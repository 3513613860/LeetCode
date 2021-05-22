class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        int [][] nums = new int [nums1.length+1][nums2.length+1];

        for(int i = 1; i <= nums1.length; i++){
            for(int j = 1; j <= nums2.length; j++){
                if(nums1[i-1] == nums2[j-1]){
                    nums[i][j] = nums[i-1][j-1]+1;
                }else{
                    nums[i][j] = Math.max(nums[i][j-1],nums[i-1][j]);
                }
            }
        }

        return nums[nums1.length][nums2.length];
    }
}
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int [] array = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.length;i++){
            if(array[i] != nums[i]){
                j = i;
                break;
            }
        }
        for(int i = nums.length - 1; i >=0; i--){
            if(array[i] != nums[i]){
                k = i;
                break;
            }
        }

        if(j < k){
            return k-j+1;
        }else if(j == k && (j!=0 && k != 0)){
            return 1;
        }else{
            return 0;
        }        
    }
}
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        int num = 0;
        for(int i = 0; i < nums.length-2; i++){
            int a = nums[i+1]-nums[i];
            int b = nums[i+2]-nums[i+1];
            if(a == b){
                num++;
            }else{
                continue;
            }

            for(int j = i+3; j < nums.length; j++){
                if(nums[j]-nums[j-1] == a){
                    num++;
                }else{
                    break;
                }
            }
        }
        return num;
    }
}
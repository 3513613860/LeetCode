class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //1.先排序，后面会用到二分查找
        Arrays.sort(nums);
        //2.定义返回的ret结果
        int ret = nums[0]+nums[1]+nums[2];
        //3.定义init变量，为ret和target的差值
        int init = Math.abs(ret-target);
        for(int i = 0; i < nums.length-1; i++){
            int temp = nums[i];
            int left = i+1;
            int right = nums.length-1;
            int cur = temp;
            //4.采用二分查找，小于left++，大于right--
            while(left < right){
                cur = temp + nums[left]+nums[right];
                //5.如果cur等于target，直接退出循环
                if(cur == target){
                    ret = cur;
                    break;
                }
                if(cur > target){
                    int pos = cur - target;
                    if(pos < init){
                        init = pos;
                        ret = cur;
                    }
                    right--;
                }else{
                    int pos = target - cur;
                    if(pos < init){
                        init = pos;
                        ret = cur;                        
                    }
                    left++;
                }
            }
            //6.如果cur等于target，直接退出循环
            if(cur == target){
                break;
            }
        }
        return ret;
    }
}
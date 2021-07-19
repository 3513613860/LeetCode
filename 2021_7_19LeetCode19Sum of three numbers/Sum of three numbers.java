class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1.先排序
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        //2.如果数组为空或数组长度小于3，返回空集合
        if(nums == null || nums.length == 0 || nums.length < 3){
            return list;
        }

        //3.外层循环控制第一个数
        for(int i = 0; i <nums.length-2; i++){
            int ret = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;
            //4.内层循环采用双指针，小的时候left++，大的时候right--
            while(left < right){
                int cur = nums[left]+nums[right];
                if(cur < ret){
                    left++;
                }else if(cur > ret){
                    right--;
                }else{
                    //5.相等时，把小集合放入大集合中，但是需要去重
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    if(!set.contains(subList)){
                        set.add(subList);
                        list.add(subList);
                    }
                    left++;
                }
            }
        }
        return list;
    }
}
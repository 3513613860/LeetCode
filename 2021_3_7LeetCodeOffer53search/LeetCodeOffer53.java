package Code2021_3_7;

public class LeetCodeOffer53 {
    public static void main(String[] args) {
        int [] array = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(search(array,target));
    }

    public static int search(int[] nums, int target) {
        //采用二分查找
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        //i <= j 时
        while(i <= j){
            int mid = (i+j)/2;
            //如果找到一个相等的，向两边查找所有与之相等的
            if(nums[mid] == target){
                int k = mid;
                while(k >= 0 && nums[k] == target){
                    k--;
                }
                while(mid <= nums.length - 1 && nums[mid] == target){
                    mid++;
                }
                count = mid - k - 1;
                break;
            }
            //中间值小于target，在右边找
            if(nums[mid] < target){
                i = mid + 1;
            }
            //中间值大于target，在左边找
            if(nums[mid] > target){
                j = mid - 1;
            }
        }
        return count;
    }
}

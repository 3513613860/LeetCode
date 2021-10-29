class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //1.使用双层for循环,结果会超时，推荐使用第二种方法或者第三种
        int [] ret = new int [2];
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;

        //2.使用hashmap进行存储，遍历一次就可以
        // int [] ret = new int [2];
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(numbers[0],0);
        // for(int i = 1; i < numbers.length; i++){
        //     int second = target-numbers[i];
        //     if(map.containsKey(second)){
        //         ret[0] = map.get(second);
        //         ret[1] = i;
        //         break;
        //     }else{
        //         map.put(numbers[i],i);
        //     }
        // }
        // return ret;

        //3.二分查找
        // int [] ret = new int [2];
        // int low = 0;
        // int high = numbers.length-1;
        // while(low < high){
        //     if(numbers[low]+numbers[high] < target){
        //         low++;
        //     }else if(numbers[low]+numbers[high] > target){
        //         high--;
        //     }else{
        //         ret[0] = low;
        //         ret[1] = high;
        //         break;
        //     }
        // }
        // return ret;
    }
}
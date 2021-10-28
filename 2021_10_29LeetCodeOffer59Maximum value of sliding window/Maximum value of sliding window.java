class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //1.当数组为空或者数组长度为0时
        if(nums.length == 0 || nums == null){
            return new int [0];
        }
        //2.返回时的数组
        int [] array = new int [nums.length-k+1];
        int t = 0;
        //3.定义一个优先级队列
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
        //4.建立k个数的大根堆
        for(int i = 0; i < k; i++){
            pq.add(nums[i]);
        }
        array[t++] = pq.peek();
        
        int l = 0;
        //5.循环遍历一次，删除最左边的元素，添加右边的元素
        for(int j = k; j < nums.length;j++){
            pq.remove(nums[l++]);
            pq.add(nums[j]);
            array[t++] = pq.peek();
        }
        return array;
    }
}
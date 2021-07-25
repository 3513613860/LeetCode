class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        //1.创建一个map集合
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        //2.存储时，key为整型，value为集合（key为当前元素，value为相邻元素）
        for(int i = 0; i < adjacentPairs.length; i++){
            map.putIfAbsent(adjacentPairs[i][0],new ArrayList<>());
            map.putIfAbsent(adjacentPairs[i][1],new ArrayList<>());
            map.get(adjacentPairs[i][0]).add(adjacentPairs[i][1]);
            map.get(adjacentPairs[i][1]).add(adjacentPairs[i][0]);
        }

        //3.开辟一个返回的数组
        int [] nums = new int [adjacentPairs.length+1];

        //4.找到出现一次的元素
        Set<Map.Entry<Integer,List<Integer>>> set = map.entrySet();
        for(Map.Entry<Integer,List<Integer>> entry:set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            if(entry.getValue().size() == 1){
                nums[0] = entry.getKey();
                nums[1] = entry.getValue().get(0);
                System.out.println(Arrays.toString(nums));
                break;
            }
        }

        //5.连接剩余的元素
        for(int i = 2; i < nums.length; i++){
            List<Integer> curList = map.get(nums[i-1]);
            System.out.println(curList);
            if(curList.get(0) == nums[i-2]){
                nums[i] = curList.get(1);
            }else{
                nums[i] = curList.get(0);
            }
        }
        return nums;
    }
}
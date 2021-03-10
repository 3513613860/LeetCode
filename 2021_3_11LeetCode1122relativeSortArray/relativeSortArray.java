class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //创建HashMap对象
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] arr = new int [arr1.length];
        int k = 0;
        //将arr2中的元素放入map中
        for(int i = 0; i < arr2.length; i++){
            map.put(arr2[i],0);
        }
        //遍历arr1，如果包含，放入map中，如果不包含，放入arr数组中
        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){
                int t = map.get(arr1[i]);
                map.put(arr1[i],t+1);
            }else{
                arr[k++] = arr1[i];
            }
        }
        //未出现的数进行排序
        Arrays.sort(arr,0,k);
        int count = 0;
        int [] array = new int[arr1.length];
        //遍历存放
        for(int i = 0; i < arr2.length; i++){
            int c = map.get(arr2[i]);
            while(c > 0){
                array[count++] = arr2[i];
                c--; 
            }
        }
        //遍历存放
        for(int i = 0; i < k; i++){
            array[count++] = arr[i];
        }
        return array;
    }
}
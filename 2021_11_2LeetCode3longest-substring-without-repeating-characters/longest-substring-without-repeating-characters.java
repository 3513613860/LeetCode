class Solution {
    public int lengthOfLongestSubstring(String s) {
        //1.使用hashset进行存储，如果重复，移除左边的元素
        // if(s == null || s.length() == 0){
        //     return 0;
        // }
        // int max = 0;
        // int i = 0;
        // int j = 0;
        // Set<Character> set = new HashSet<>();
        // while(j < s.length()){
        //     while(set.contains(s.charAt(j))){
        //         set.remove(s.charAt(i++));
        //     }
        //     set.add(s.charAt(j++));
        //     max = Math.max(max,j-i);
        // }
        // return max;


        //2.使用hashmap进行存储，当有重复元素时，左指针移动到重复位置+1和左指针
        //两者中的最大值
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = 0;
        int i = 0;
        int j = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(j < s.length()){
            // if(!map.containsKey(s.charAt(j))){
            //     map.put(s.charAt(j),j);
            // }else{
            //     int t = map.get(s.charAt(j));
            //     if(t >= i){
            //         i = t+1;
            //     }
            //     map.put(s.charAt(j),j);
            // }
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j))+1,i);
            }
            map.put(s.charAt(j),j);
            j++;
            max = Math.max(max,j-i);  
        }
        return max;
    }
}
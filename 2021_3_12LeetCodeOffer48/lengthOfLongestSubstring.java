class Solution {
    public int lengthOfLongestSubstring(String s) {
        //双层for循环会超出时间限制
        // if(s.equals(" ") || s.length()==1){
        //     return 1;
        // }
        // int max = 0;
        // for(int i = 0; i < s.length()-1; i++){
        //     for(int j = i; j < s.length(); j++){
        //         int count = 0;
        //         HashSet<Character> set = new HashSet<>();
        //         while(j < s.length() && !set.contains(s.charAt(j))){
        //             set.add(s.charAt(j));
        //             count++;
        //             j++;
        //         }
        //         j--;
        //         if(count > max){
        //             max = count;
        //         }
        //     }
        // }
        // return max;
        int res = 0;
        //创建set对象
        Set<Character> set = new HashSet<>();
        //for循环遍历
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            //如果包含重复元素，删除前面的所有元素
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            //求最大值
            res = Math.max(res, r - l + 1);
        }

        return res;

        
    }
}
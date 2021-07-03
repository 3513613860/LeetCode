class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        //用HashMap统计每一个字符出现的次数
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                int k = map.get(s.charAt(i));
                map.put(s.charAt(i),k+1);
            }
        }

        //创建一个List集合，使用map.keySet（）来获取
        List<Character> list = new ArrayList<>(map.keySet());

        //使用字符出现的次数对list进行降序排序
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));

        //创建一个StringBuilder的对象
        StringBuilder sb = new StringBuilder();

        //遍历list集合字符（由多到少）
        for(int i = 0; i < list.size(); i++){
            int k = map.get(list.get(i));
            //每一个字符出现次数累加
            for(int j = 0; j < k; j++){
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }
}
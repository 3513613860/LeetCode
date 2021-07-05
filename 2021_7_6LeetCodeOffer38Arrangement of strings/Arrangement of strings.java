class Solution {
    //创建set集合，主要为了去重
    Set<String> set = new HashSet<>();
    public String[] permutation(String s) {
        char [] chars = s.toCharArray();
        //创建一个标记数组，记录是否使用该字符
        boolean [] used = new boolean[chars.length];

        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        //调用函数
        back(chars,sb,used);

        //定义字符串数组，用来保存结果并返回
        String [] strings = new String[set.size()];
        Iterator<String> it = set.iterator();
        int k = 0;

        //循环赋值
        while(it.hasNext()){
            strings[k++] = it.next();
        }
        return strings;

    }

    public void back(char [] chars,StringBuilder sb,boolean [] used){
        //如果长度符合字符串长度，添加至set中，并返回
        if(sb.length() == chars.length){
            set.add(new StringBuilder(sb).toString());
            return;
        }

        //循环遍历
        for(int i = 0; i < chars.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            sb.append(chars[i]);
            back(chars,sb,used);
            used[i] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
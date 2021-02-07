package Code2021_2_7;

import java.util.HashMap;

public class LeetCode205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        int n = s.length();
        //遍历字符串
        for(int i = 0; i < n; i++){
            //获取单个字符
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //map包含Key但是当前value和之前key所对应value不相等，返回false
            if(map.containsKey(c1) && !(map.get(c1) ==c2)){
                return false;
            }
            //map包含Value但是不包含Key
            if(map.containsValue(c2) && !map.containsKey(c1)){
                return false;
            }
            map.put(c1,c2);
        }
        return true;
    }
}

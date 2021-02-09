package Code2021_2_7;

import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {
    public static void main(String[] args) {
        int k = firstUniqChar("loveleetcode");
        System.out.println(k);
    }
    public static int firstUniqChar(String s) {
        //     Map<Character,Integer> map = new HashMap<>();
        //     char [] array = s.toCharArray();
        //     for(int i = 0; i < array.length; i++){
        //         char ch = s.charAt(i);
        //         map.put(ch,map.getOrDefault(ch,0)+1);
        //     }

        //     for(int i = 0; i < array.length; i++){
        //         if(map.get(array[i] == 1){
        //             return i;
        //         }
        //     }
        //     return -1;
        //

        Map<Character,Integer> map = new HashMap<>();
        //遍历字符串,进行计数
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int a = map.get(ch);
                map.put(ch,a+1);
            }
        }

        //遍历字符串，在map当中找到只出现1次的字符
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

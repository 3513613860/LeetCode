package Code2021_3_5;

import java.util.HashMap;

public class Offer50 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }

    public static char firstUniqChar(String s) {
        //创建hashMap对象
        HashMap<Character,Integer> map = new HashMap<>();
        char [] array = s.toCharArray();
        //for循环遍历字符串
        for(int i = 0; i < array.length; i++){
            //如果出现过一次，进行累加
            if(map.containsKey(array[i])){
                int k = map.get(array[i]);
                map.put(array[i],k+1);
            }else{
                //如果没有出现过一次，设置为1
                map.put(array[i],1);
            }
        }

        //从左到右进行遍历，查找出现一次的
        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == 1){
                return array[i];
            }
        }
        return ' ';
    }
}

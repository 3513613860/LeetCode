package Code2021_2_7;

import java.util.HashSet;

public class LeetCode771 {
    public static void main(String[] args) {
        int m = numJewelsInStones("aA", "aAAbbbb");
        System.out.println(m);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        //将jewels字符串存放在set集合中
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }

        //看jewels是否包含stones中的字符，如果包含，就一直累加
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}

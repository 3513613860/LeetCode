package Code2021_2_17;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode819 {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String [] s = {"bob", "hit"};
        String str = mostCommonWord(paragraph,s);
        System.out.println(str);
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String [] result = paragraph.split(" |\\,|\\.|\\!|\\?|\\;|\\'");
        for(int i = 0; i < result.length; i++){
            result[i] = result[i].toLowerCase();
        }
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: banned){
            set.add(s);
        }
        for(int i = 0; i < result.length; i++){
            String str = result[i];
            if(str.equals("")){
                continue;
            }
            if(!set.contains(str)){
                if(map.containsKey(str)){
                    map.put(str,map.get(str) + 1);
                }else{
                    map.put(str,1);
                }
            }
        }
        int max = 0;
        String maxString = "";
        for(String s:map.keySet()){
            if(map.get(s) > max){
                max = map.get(s);
                maxString = s;
            }
        }
        return maxString;
    }
}

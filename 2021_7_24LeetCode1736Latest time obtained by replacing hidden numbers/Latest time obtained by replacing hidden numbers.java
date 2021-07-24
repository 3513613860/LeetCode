class Solution {
    public String maximumTime(String time) {
        //将时间转化为字符数组
        char [] chars = time.toCharArray();
        //进行分钟的判断，直接取最大值即可
        if(chars[3] == '?'){
            chars[3] = '5';
        }
        if(chars[4] == '?'){
            chars[4] = '9';
        }

        //小时都为未知数，均取最大值
        if(chars[0] == '?' && chars[1] == '?'){
            chars[0] = '2';
            chars[1] = '3';
        }
        //第一个数为未知数，第二个已知
        if(chars[0] != '?' && chars[1] == '?'){
            if(chars[0] == '0' || chars[0] == '1'){
                chars[1] ='9';
            }else{
                chars[1] = '3';
            }
        }
        //第一个数为已知数，第二个为未知数
        if(chars[0] == '?' && chars[1] != '?'){
            if(chars[1] >= '0' && chars[1] <= '3'){
                chars[0] = '2';
            }else{
                chars[0] = '1';
            }
        }
        return new String(chars);
    }
}
class Solution {
    public int compress(char[] chars) {
        int j = 0;
        int k = 0;
        int num = 0;
        //遍历这个字符数组
        for(int i = 0; i < chars.length; i++){
            j = 1;
            //统计相同字符的个数
            while(i < chars.length -1 && chars[i] == chars[i+1]){
                i++;
                j++;
            }
            //没有相同的字符
            if(j == 1){
                chars[k++] = chars[i];
            } else{
                //有相同的字符，统计相同的个数
                chars[k++] = chars[i];
                int m = j;
                num = 0;
                if(j > 9){
                    while(j > 0){
                        j = j / 10;
                        num++;
                    }
                    int [] arr = new int [num];
                    int n = num - 1;
                    while(m > 0){
                        arr[n--] = m % 10;
                        m = m / 10;
                    }
                    n = 0;
                    while(n < num){
                        chars[k++] = (char)(arr[n]+48);
                        n++;
                    }
                }else{
                    chars[k++] = (char)(j+48);
                }
            }
        }
        return k;
    }
}
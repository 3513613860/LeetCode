package Code2021_2_11;

public class LeetCode917 {
    public static void main(String[] args) {
        String str = reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println(str);
    }

    public static String reverseOnlyLetters(String S) {
        //转化为字符数组
        char [] arr = S.toCharArray();
        int i = 0;
        int j  = arr.length - 1;
        //索引 i < j
        while(i < j){
            //从左到右找第一个字母
            while(i <j && !(arr[i] >= 'a'&& arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')){
                i++;
            }
            //从右到左找第二个字母
            while(i < j && !(arr[j] >= 'a'&& arr[j] <= 'z' || arr[j] >= 'A' && arr[j] <= 'Z')){
                j--;
            }
            //交换
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String str = new String(arr);
        return str;
    }
}

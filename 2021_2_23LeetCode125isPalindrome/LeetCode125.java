package Code2021_2_21;

public class LeetCode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'a' && s.charAt(i)
                        <='z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    break;
                }
                i++;
            }
            while(i < j){
                if(s.charAt(j) >= '0' && s.charAt(j) <= '9' || s.charAt(j) >= 'a' && s.charAt(j)
                        <='z' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'){
                    break;
                }
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

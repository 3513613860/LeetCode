class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        int k = arr1.length;
        int i = 0;
        int j = k-1;

        while(i < j && arr1[i] == arr2[i]){
            i++;
        }

        while(i < j && arr1[j] == arr2[j]){
            j--;
        }

    
        char temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;

        String str1 = new String(arr1);
        String str2 = new String(arr2);
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
        
    }
}
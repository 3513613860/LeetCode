class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char [] array1 = name.toCharArray();
        char [] array2 = typed.toCharArray();
        if(array1.length > array2.length){
            return false;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        for( i = 0; i < array1.length && m < array2.length ; i++,m++){
            j = 1;
            k = 1;
            if(array1[i] != array2[m]){
                return false;
            }
            while(i < array1.length-1 && array1[i] == array1[i+1]){
                i++;
                j++;
            }
            while(m < array2.length-1 && array2[m] == array2[m+1]){
                m++;
                k++;
            }
            if(j > k ){
                return false;
            }
        }
        if(m != array2.length || i != array1.length){
            return false;
        }
        return true;
    }
}
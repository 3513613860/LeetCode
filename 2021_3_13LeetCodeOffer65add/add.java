class Solution {
    public int add(int a, int b) {
        // if(b == 0){
        //     return a;
        // }        

        // int c = (a & b) << 1;
        // int d = a ^ b;
        // return add(d,c);    
        while(b != 0){
            //进位
            int c = (a & b) << 1;
            //当前位
            int d = a ^ b;
            b = c;
            a = d;
        }
        return a;
    }
}
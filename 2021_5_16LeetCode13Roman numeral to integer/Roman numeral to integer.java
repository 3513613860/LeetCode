class Solution {
    public int romanToInt(String s) {
        int num = 0;
        char [] chars = s.toCharArray();
        int i = chars.length -1;
        while(i >= 0){
            if(i >= 0 && chars[i] == 'I'){
                num++;
                i--;
            }else if(i >=1 && chars[i] == 'M' && chars[i-1] == 'C'){
                num += 900;
                i = i -2;
            }else if(i >=1 &&chars[i] == 'M' && chars[i-1] != 'C'){
                num += 1000;
                i--;
            }else if(i >= 0 && chars[i] == 'M'){
                num += 1000;
                i--;
            }else if(i >= 1 && chars[i] == 'D' && chars[i-1] == 'C'){
                num += 400;
                i = i -2;
            }else if(i >= 1 && chars[i] == 'D' && chars[i-1] != 'C'){
                num += 500;
                i--;
            }else if(i >= 0 && chars[i] == 'D'){
                num += 500;
                i--;
            }else if(i >= 1 && chars[i] == 'C' && chars[i-1] == 'X'){
                num += 90;
                i = i -2;
            }else if(i >= 1 && chars[i] == 'C' && chars[i-1] != 'X'){
                num += 100;
                i--;
            }else if(i >= 0 && chars[i] == 'C'){
                num += 100;
                i--;
            }else if(i >= 1 && chars[i] == 'L' && chars[i-1] == 'X'){
                num += 40;
                i = i - 2;
            }else if(i >= 1 && chars[i] == 'L' && chars[i-1] != 'X'){
                num += 50;
                i--;
            }else if(i >= 0 && chars[i] == 'L'){
                num += 50;
                i--;
            }else if(i >= 1 && chars[i] == 'X' && chars[i-1] == 'I'){
                num += 9;
                i = i - 2;
            }else if(i >= 1 && chars[i] == 'X' && chars[i-1] != 'I'){
                num += 10;
                i--;
            }else if(i >= 0 && chars[i] == 'X'){
                num += 10;
                i--;
            }else if(i >= 1 && chars[i] == 'V' && chars[i-1] == 'I'){
                num += 4;
                i = i - 2;
            }else if(i >= 1 && chars[i] == 'V' && chars[i-1] != 'I'){
                num += 5;
                i--;
            }else if(i >= 0 && chars[i] == 'V'){
                num += 5;
                i--;
            }else{

            }
        }
        return num;
    }
}
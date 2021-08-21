class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                for(int k = 1; k <= 3; k++){
                    int z = s.length()-(i+j+k);
                    if(z > 0 && z <= 3){
                        int a = Integer.parseInt(s.substring(0,i));
                        int b = Integer.parseInt(s.substring(i,i+j));
                        int c = Integer.parseInt(s.substring(i+j,i+j+k));
                        int d = Integer.parseInt(s.substring(i+j+k));
                        if(a >= 0 && a <= 255 && b>= 0 && b <= 255
                        && c >= 0 && c <= 255 && d >=0 && d <= 255 ){
                            String cur = a+"."+b+"."+c+"."+d;
                            if(cur.length() == s.length()+3){
                                list.add(cur);
                            }

                        }
                    }
                }
            }
        }
        return list;

    }
}
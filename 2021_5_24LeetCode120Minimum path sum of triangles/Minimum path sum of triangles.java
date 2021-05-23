class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n == 1){
            return triangle.get(0).get(0);
        }
        
        for(int i = 1; i < n; i++){
            List<Integer> list = triangle.get(i-1);
            List<Integer> list2 = triangle.get(i);
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    if(j == 0){
                        list2.set(j,list.get(0)+list2.get(0));
                    }else{
                        list2.set(j,list.get(j-1)+list2.get(j));
                    }
                }else{
                    list2.set(j,Math.min(list.get(j-1),list.get(j))+list2.get(j));
                }
            }
        }

        int min = 100000;
        List<Integer> retList = triangle.get(n-1);
        for(int i = 0; i < retList.size(); i++){
            if(retList.get(i) < min){
                min = retList.get(i);
            }
        }

        return min;
    }
}
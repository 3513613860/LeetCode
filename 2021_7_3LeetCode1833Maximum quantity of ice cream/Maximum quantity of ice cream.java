class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int curSum = 0;
        for(int i = 0; i <costs.length; i++){
            curSum += costs[i];
            if(curSum <= coins){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
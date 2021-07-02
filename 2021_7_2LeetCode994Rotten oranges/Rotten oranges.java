class Solution {
    int [][] move = {{1,0},{-1,0},{0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int step =0;

        //1.定义一个队列
       Queue<int []> queue = new LinkedList<>();

       //2.将所有腐烂的橘子入队
       for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[0].length; j++){
               if(grid[i][j] == 2){
                   int [] nums = new int[2];
                   nums[0] = i;
                   nums[1] = j;
                   queue.offer(nums);
               }
           }
       }

       //3.判断队列是否为空
       while(!queue.isEmpty()){
           int size = queue.size();
           boolean flag = false;

           //4.队列中的腐烂橘子数量
           while(size > 0){
               int [] array = queue.poll();
               //5.上下左右进行感染
               for(int i = 0; i < 4; i++){
                   int a = array[0] + move[i][0];
                   int b = array[1] + move[i][1];
                   if(a < 0 || a >= grid.length || b < 0 || 
                      b >= grid[0].length || grid[a][b] != 1){
                          continue;
                      }
                    grid[a][b] = 2;
                    int [] newArray = new int[2];
                    flag = true;
                    newArray[0] = a;
                    newArray[1] = b;
                    queue.offer(newArray);
               }
               size--;
           }

           if(flag == true){
               step++;
           }
       } 

       for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[0].length; j++){
               if(grid[i][j] == 1){
                   return -1;
               }
           }
       }

       return step;
    }
}
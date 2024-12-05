package SolutionList.MaxAreaOfIsland;

class Solution {
    int row;
    int col;
    int res;

    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;

        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(grid[i][j]!=0){
                    res = Math.max(res,handle(grid,i,j));
                }
            }
        }

        return res;
    }

    public int handle(int[][] grid,int i,int j) {
        if(i<0||i>=row||j<0||j>=col||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int sum = 1;
        sum+=handle(grid,i+1,j);
        sum+=handle(grid,i,j+1);
        sum+=handle(grid,i-1,j);
        sum+=handle(grid,i,j-1);
        return sum;
    }
}

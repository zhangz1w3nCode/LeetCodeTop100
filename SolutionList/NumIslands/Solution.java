package SolutionList.NumIslands;

class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res=0;
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(grid[i][j]!='0'){
                    ++res;
                    handle(grid,i,j);
                }
            }
        }
        return res;
    }
    public void handle(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        if(i<0||i>=row||j<0||j>=col||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        handle(grid,i+1,j);
        handle(grid,i,j+1);
        handle(grid,i-1,j);
        handle(grid,i,j-1);
    }
}
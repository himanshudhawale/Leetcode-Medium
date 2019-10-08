class Solution {
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                count += dfs(grid, i, j);
            }
        }
        
        return count;
    }
    
   public int dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return 0;
        }
        
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        
        return 1;
    }
}
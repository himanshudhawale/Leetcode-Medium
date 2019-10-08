class TicTacToe {

    /** Initialize your data structure here. */
    int[] rows, cols, diagonals;
    boolean[][] visited;
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        diagonals = new int[2];
        visited = new boolean[n][n];
    }
    
  
    public int move(int row, int col, int player) {
        if (visited[row][col]) return 0;
        
        int val = player == 1 ? 1 : -1;
        visited[row][col] = true;
        
        rows[row] += val;
        cols[col] += val;
        if (row == col) diagonals[0] += val;
        if (row + col == rows.length - 1) diagonals[1] += val;
        
        int n = rows.length;
        if (rows[row] == n || rows[row] == -n || cols[col] == n || cols[col] == -n ||
           diagonals[0] == n || diagonals[0] == -n || diagonals[1] == n || diagonals[1] == -n) return                   player;    
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
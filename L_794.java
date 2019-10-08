class Solution {
    public boolean validTicTacToe(String[] board) {
        int sumO = 0, sumX = 0;
        boolean isDone = false, xWin = false, oWin = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') sumX += 1;
                if (board[i].charAt(j) == 'O') sumO += 1;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (board[i].equals("XXX") || (board[0].charAt(i) == 'X' && board[1].charAt(i) == 'X' &&
                                           board[2].charAt(i) == 'X')) {
                isDone = true;
                xWin = true;
            }
            if (board[i].equals("OOO") || (board[0].charAt(i) == 'O' && board[1].charAt(i) == 'O' &&
                                           board[2].charAt(i) == 'O')) {
                isDone = true;
                oWin = true;
            }
        }
        
        if ((board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X') ||
           (board[0].charAt(2) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(0) == 'X')) {
            isDone = true;
            xWin = true;
        }
        
        if ((board[0].charAt(0) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(2) == 'O') ||
           (board[0].charAt(2) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(0) == 'O')) {
            isDone = true;
            oWin = true;
        }
                
        if (!isDone) {
            return sumX == sumO + 1 || sumX == sumO;
        } else {
            if (xWin && oWin) {
                return false;
            }
            if (xWin) {
                return sumX == sumO + 1;
            }
            else {
                return sumX == sumO;
            }            
        }       
    }
}
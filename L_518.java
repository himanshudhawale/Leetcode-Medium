class Solution {
    public int change(int amount, int[] coins) {
        int [][] mat = new int[coins.length+1][amount+1];
        mat[0][0]=1;
        
        for(int i=1; i<=coins.length; i++)
        {
            mat[i][0]=1;
            for(int j=1; j<=amount; j++)
            {
                mat[i][j] = mat[i-1][j] + (j >= coins[i-1] ? mat[i][j-coins[i-1]] : 0);
            }
        }
        return mat[coins.length][amount]; 
    }
}
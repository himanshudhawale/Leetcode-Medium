class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0 || matrix == null)
            return new int[0];
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row*col];
        int i=0,j=0;
        int p=0;
        
        while(i<row && j<col)
        {
            while(i>=0 && j<col)
            {
                result[p]=matrix[i][j];
                p++;
                j++;
                i--;
            }
            i++;
            if(j==col)
            {
                j--;
                i++;
            }
            while(j>=0 && i<row)
            {
                result[p]=matrix[i][j];
                p++;
                j--;
                i++;
            }
            j++;
            if(i==row)
            {
                i--;
                j++;
            }
        }
        
        return result;
    }
}
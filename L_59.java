class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n]; 
        int l=0,k=0;
        int row = n;
        int col = n;
        int count=0;
        while(k<row && l<col)
        {
            for(int i=l;i<col;i++)
            {
                count++;
                matrix[k][i]=count;
            }
            k++;
            for(int i=k;i<row;i++)
            {
                count++;
                matrix[i][col-1]=count;
            }
            col--;
            if(k<row)
            {
                for(int i=col-1;i>=l;i--)
                {
                    count++;
                    matrix[row-1][i]=count;
                }
                row--;
            }
            if(l<col)
            {
                for(int i=row-1;i>=k;i--)
                {
                    count++;
                    matrix[i][l]=count;
                }
                l++;
            }
            
            
        }
        return matrix;
    }
}
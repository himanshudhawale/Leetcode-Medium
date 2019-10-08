class Solution {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        boolean checkrow=false;
        boolean checkcol=false;
        for(int i=0;i<R;i++)
        {
            if(matrix[i][0]==0)
            {
                checkcol=true;
                break;
            }
        }
        
        for(int i=0;i<C;i++)
        {
            if(matrix[0][i]==0)
            {
                checkrow=true;
                break;
            }
        }
        
        for(int i=1;i<R;i++)
        {
            for(int j=1;j<C;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        
        for(int i=1;i<R;i++)
        {
            for(int j=1;j<C;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        if(checkrow)
        {
            for(int i=0;i<C;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(checkcol)
        {
            for(int i=0;i<R;i++)
            {
                matrix[i][0]=0;
            }
        }
        
    }
}
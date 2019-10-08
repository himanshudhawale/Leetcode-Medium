class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // int p=0;
        int l=0,k=0;
        
        List<Integer> list = new ArrayList<>();
        if(matrix.length==0 || matrix == null)
            return list;
        
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        while(k<row && l<col)
        {
            for(int i=l; i<col;i++)
            {
                list.add(matrix[k][i]);
            }
            k++;
            for(int i=k;i<row;i++)
            {
                list.add(matrix[i][col-1]);
            }
            col--;
            if(k<row)
            {
                for(int i=col-1;i>=l;i--)
                {
                    list.add(matrix[row-1][i]);
                }
                row--;
            }
            if(l<col)
            {
                for(int i=row-1;i>=k;i--)
                {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
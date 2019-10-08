class Solution {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int len =M.length;
        int count =0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<len;i++)
        {
            if(visited[i]==0)
            {
                queue.add(i);
                while(!queue.isEmpty())
                {
                    int s = queue.remove();
                    visited[s] = 1;
                    for(int j=0;j<len;j++)
                    {
                        if(M[s][j]==1 && visited[j]==0)
                            queue.add(j);
                    }
                }
                
                count++;
            }
        }
        return count;
        
    }
}
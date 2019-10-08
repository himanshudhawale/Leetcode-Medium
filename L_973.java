class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] ans = new int[K][2]; 
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
           @Override
            public int compare(int[] a1, int[] a2)
            {
                double dist1 = getDistance(a1);
                double dist2 = getDistance(a2); 
                
                if(dist1>dist2)
                {
                    return 1; 
                }
                else if(dist1<dist2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        
        for(int[] point : points)
            pq.add(point); 
        
        for(int i=0;i<K;i++)
        {
            ans[i] = pq.poll();
        }
        
        return ans;
    }
    public double getDistance(int[] point)
    {
        return Math.sqrt(Math.pow(point[0],2) + Math.pow(point[1],2));
    }
}
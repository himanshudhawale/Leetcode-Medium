class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            q.offer(nums[i]);
            if(q.size()>k)
            {
                q.poll();
            }
            
        }
        Iterator itr=q.iterator();
        int result=0;
        if(q.size()<k)
        {
            while(itr.hasNext())
            {
                result=q.poll();
            }
            return result;
        }
        result=q.peek();
        
        return result;
    }
}
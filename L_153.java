class Solution {
    public int findMin(int[] nums) {
        int start=0, end=nums.length-1;
        if(nums.length==1)
            return nums[0];
        
        if(nums[0]<nums[end])
            return nums[0];
        
        
        while(start<=end)
        {
            int mid= (start+end)/2;
            
            if(nums[mid]<nums[end])
                end=mid;
            else if(nums[mid]>nums[end])
                start=mid+1;
            else
                end--;
            
        }
        return nums[start];
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0],min=nums[0],result=nums[0], localmax=nums[0], localmin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            localmax=Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            localmin=Math.min(Math.min(min*nums[i],max*nums[i]),nums[i]);
            result=Math.max(localmax,result);
            max=localmax;
            min=localmin;
        }
        return result;
    }
}
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0,j=0;
        int sum=0, result=0;
        for(int k =0 ; k<nums.length;k++)
        {
            sum=sum+nums[k];
            while(sum>=s && i<=j )
            {
                if(result==0 || result>j-i+1)
                {
                    result=j-i+1;
                }
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        return result;
    }
}
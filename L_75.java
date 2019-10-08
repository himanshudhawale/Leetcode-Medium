class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int curr = 0;
        int end = nums.length-1;
        
        while(curr<=end)
        {
            if(nums[curr]==0)
            {
                int temp = nums[start];
                nums[start] = nums[curr];
                nums[curr] = temp;
                start++;curr++;
            }
            else if(nums[curr]==2)
            {
                int temp = nums[end];
                nums[end] = nums[curr];
                nums[curr] =temp;
                end--;
            }
            else
            {
                curr++;
            }
        }
        
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> xyz=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(xyz.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                xyz.add(nums[i]);
            }
        }
        return 0;
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        
        for(int num : nums)
        {
            for(int i=0 , j=ans.size(); i<j; i++)
            {
                List<Integer> temp = new ArrayList<>(ans.get(i));
                temp.add(num); 
                ans.add(temp);
            }
        }
        return ans;
        
    }
}
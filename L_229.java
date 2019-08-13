class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size=nums.length;
        int times=(size/3); 
        List<Integer> list=new ArrayList<>();
        HashMap<Integer, Integer> x=new HashMap<>();
        for(int i=0; i<size; i++)
        {
            if(x.containsKey(nums[i]))
            {
                x.put(nums[i], x.get(nums[i])+1);
            }
            else{
                x.put(nums[i], 1);
            }
            
        }
       
        for(int key : x.keySet())
        {
            if(x.get(key)>times)
            {
                list.add(key);
            }
        }
        
        return list;
        
        
        
    }
}
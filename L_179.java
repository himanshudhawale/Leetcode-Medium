class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length]; 
        
        for(int i=0;i<str.length;i++)
        {
            str[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(str,new largestNumComparator());
        
        if(str[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s: str)
        {
            sb.append(s);
        }
        return sb.toString();
        
    }
    
    
    private class largestNumComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2)
        {
            String order1 = s1+s2;
            String order2 = s2+s1;
            return order2.compareTo(order1);
        }
    }
}
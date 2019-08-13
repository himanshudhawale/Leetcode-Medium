class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c : s.toCharArray())
        {
            if(!(map.containsKey(c)))
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c)+1);
            }
        }
        
        StringBuffer[] buckets = new StringBuffer[s.length() + 1];
        for(char c: map.keySet())
        {
            int count= map.get(c);
            if (buckets[count] == null) {
                buckets[count] = new StringBuffer();
            }
            
            for (int i = 0; i < count; i++) {
                buckets[count].append(c);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = s.length(); i > 0; i--) {
            if (buckets[i] == null) {
                continue;
            }

            sb.append(buckets[i]);
        }
        return sb.toString();
            
        
        
    }
}
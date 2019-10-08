class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int[] count = new int[26];
            // Arrays.fill(count,0);
            for(char c : s.toCharArray())
            {
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count)
            {
                sb.append("#");
                sb.append(i);
            }
            if(!map.containsKey(sb.toString()))
            {
                map.put(sb.toString(),new ArrayList<>());
            }
            map.get(sb.toString()).add(s);
            
        }
        return new ArrayList(map.values());
    }
}
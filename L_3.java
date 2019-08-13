public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int result = 0;
        int[] arr = new int[128]; //ASCII
        int i=0;
        for (int j = 0; j < len; j++) {
            
            i = Math.max(arr[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);  //j-i is from i th to j th element + 1 
            arr[s.charAt(j)] = j + 1; //increment by 1
        }
        return ans;
    }
}
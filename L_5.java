class Solution {
    public String longestPalindrome(String s) {
        int max=0; String ans="";
        for(int i=0;i<s.length();i++)
        {
            String x = expand(s,i,i);
            if(max<x.length())
            {
                max= x.length();
                ans=x;
            }
            x = expand(s,i,i+1);
            if(max<x.length())
            {
                max=x.length();
                ans=x;
            }
            
        }
        return ans;
        
    }
    
    public String expand(String str, int s, int e)
    {
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e))
        {
            s--;
            e++;
        }
        return str.substring(s+1,e);
    }
}
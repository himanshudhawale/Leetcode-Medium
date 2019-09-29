class Solution {
    public int compareVersion(String version1, String version2) {
        int v1=0, v2=0;
        
        for(int i=0, j=0 ; i<version1.length() || j<version2.length();i++,j++)
        {
            while(i<version1.length() && version1.charAt(i)!='.')
            {
                v1=v1*10 + version1.charAt(i) - '0';
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.')
            {
                v2=v2*10 + version2.charAt(j) - '0';
                j++;
            }
            if(v1>v2)
                return 1;
            if(v1<v2)
                return -1;
            
            v1=0;v2=0;
            
        }
        return 0;
    }
}
//Naive solution 5% faster
class Solution {
    public void reverseWords(char[] s) {
        String str=String.valueOf(s);
        String[] arr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            if(i!=0)
            {
                sb.append(" ");
            }
        }
        str= sb.toString();
        for(int i=0;i<str.length();i++)
        {
            s[i]=str.charAt(i);
        }

    }
}

//100% faster solution

class Solution {
    public void reverseWords(char[] s) {
        int j=s.length -1;
        int i=0;
        reverseMe(s,0,j);
        int len=0;
        while(len<s.length)
        {
            i=len;
            while (i < s.length && s[i] != ' ') {
                i++;
            }
            reverseMe(s,len,i-1);
            len=i;
            // i++;
            while (len < s.length && s[len] == ' ') {
                len++;
            }
        }
    }
    
    public void reverseMe(char[] s,int m,int j)
    {
       
        for(int i=m;i<=j;i++)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
    }
}
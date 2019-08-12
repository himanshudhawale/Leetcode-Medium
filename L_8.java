class Solution {
    public int myAtoi(String str) {
        str=str.trim();
        char[] arr = str.toCharArray();
        double result=0;
        char myflag='+';
        char c='a';
        int sign=0;
        if(arr.length==0 || arr==null)
            return 0;
        if(arr[0]=='-')
            myflag='-';
        else if(arr[0]=='+')
            myflag='+';
        else if(Character.isDigit(arr[0]))
            result=result*10 + (arr[0]-'0');
        else
            return (int) result; 
        
        for(int i=1;i<arr.length;i++)
        {
            
           
            if(Character.isDigit(arr[i]))
                result=result*10 + (arr[i]-'0');
            
                //do nothing
            else if(!Character.isLetterOrDigit(arr[i]))
                break;
            else if(Character.isLetter(arr[i]))
                break;
        }
        if(myflag=='-')
                result=-result;
          
        if(result>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)result;
    }
}
class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        String s1 = new StringBuilder(num1).reverse().toString();
        String s2 = new StringBuilder(num2).reverse().toString();

        int[] result = new int[len1+len2];
        StringBuilder sb = new StringBuilder();


        for(int i=0; i<len1;i++)
        {
            for(int j=0;j<len2;j++)
            {
                result[i+j] = result[i+j] + ((s1.charAt(i)-'0')*(s2.charAt(j)-'0'));
            }
        }
        
        for(int i=0;i<result.length;i++)
        {
            int x = result[i]%10;
            int carry = result[i]/10;
            if(i+1<result.length)
            {
                result[i+1]+=carry;
            }
            sb.insert(0,x);
            
        }
        while(sb.charAt(0)=='0' && sb.length()>1){
                sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}

// 4 5 6
// 1 2 3


// 3 2 1
// 6 5 4

//56088

// 4 5 6 8 10 12 12 15 18
// 18 15 12 12 10 8 6 5 4
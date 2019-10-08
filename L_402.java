class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())
            return "0";
        Stack<Character> stack = new Stack<>();
        int counter=0;
        while(counter<num.length())
        {
            while((k>0 && !stack.isEmpty()) && stack.peek()>num.charAt(counter))
            {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(counter));
            counter++;
        }
        StringBuilder sb = new StringBuilder();
        
            while(k>0)
            {
                stack.pop();
                k--;
            }
        
        while(!stack.isEmpty())
        {
            sb.insert(0,stack.pop());
        }
        while(sb.length()>1 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
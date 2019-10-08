class Solution {
    public int calculate(String s) {
        int sum=0, num=0;
        char opr = '+'; 
        Stack<Integer> stack = new Stack<>();
        for(char c : (s+"+").toCharArray())
        {
            if(c== ' ') continue; 
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else{
                switch(opr)
                {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                     
                }
                opr = c;
                num=0;
            }
        }
        while(!stack.isEmpty())
        {
            sum=sum+stack.pop();
        }
        
        return sum;
    }
}
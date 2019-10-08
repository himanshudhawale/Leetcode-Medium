class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        
        int overlap = 0;
        
        if(!((E>C) || (F>D) || (H<B)  || (G<A)))
        {
            overlap = (Math.min(C,G)-Math.max(A,E))*(Math.min(H,D)-Math.max(B,F));
        }
        
        return area1+area2-overlap; 
    }
}
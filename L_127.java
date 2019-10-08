class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        
        if(!wordSet.contains(endWord))
            return 0; 
        
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> tempSet;
        
        beginSet.add(beginWord);
        endSet.add(endWord);
        
        Set<String> visitedSet = new HashSet<>();
        visitedSet.add(beginWord);
        visitedSet.add(endWord);
        
        int dist = 2;
        
        
        while(!beginSet.isEmpty() && !endSet.isEmpty())
        {
            tempSet = new HashSet<>();
            for(String word : beginSet)
            {
                List<String> neighbors = getNeighbors(wordSet, word);
                for(String neigh : neighbors)
                {
                    if(endSet.contains(neigh))
                    {  return dist; 
                    }
                    
                    if(!visitedSet.contains(neigh)){
                        visitedSet.add(neigh);
                        tempSet.add(neigh);
                    }
                }
            }
                
                beginSet = tempSet; 
                if(beginSet.size()>endSet.size())
                {
                    Set<String> t = beginSet;
                    beginSet = endSet; 
                    endSet = t;
                }
                
                dist++;

        }
        return 0;  
    }


        
        
    private List<String> getNeighbors(Set<String> wordSet, String word)
    {
        List<String> result = new ArrayList<>();
     
        for(int i=0;i<word.length();i++)
        {
            char[] A = word.toCharArray();
            for(char ch='a';ch<='z';ch++)
            {
                A[i] = ch;
                String s = String.valueOf(A);
                if(!s.equals(word) && wordSet.contains(s)){
                    result.add(s);
                }
                
            }
        }
        
        return result;
    }
        
}
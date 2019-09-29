class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words)
        {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>(
            (o1,o2) -> map.get(o1).equals(map.get(o2)) ? 
            o2.compareTo(o1) : map.get(o1) - map.get(o2));
        
        for(String word: map.keySet())
        {
            heap.offer(word);
            if(heap.size()>k)
                heap.poll();
        }
        
        List<String> result = new ArrayList<>();
        while(!heap.isEmpty())
        {
            result.add(heap.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
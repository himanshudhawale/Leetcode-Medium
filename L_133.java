class Solution{
    public Node cloneGraph(Node node
    {
      if(node == null) return null;

      Map<Integer, Node> map = new HashMap<>();
      map.put(node.val, new Node(node.val, new ArrayList<>()));
      Queue<Node> queue = new LinkedList<>();
      queue.offer(node);

      while(!queue.isEmpty())
      {
        int size = queue.size();
        Node curr = queue.poll();
        if(curr.neighbors == null || curr.neighbors.size()==0)
        {
          continue;
        }

        for(Node n : curr.neighbors){
          if(!map.containsKey(n.val))
          {
            queue.add(n);
            map.put(n.val, new Node(n.val, new ArrayList<>()));
          }
          map.get(curr.val).add(n);
        }
      }

      return map.get(node.val);
    }


}

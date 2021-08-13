/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    public Node cloneGraph(Node node) {
        // lets use bfs
        // if node is empty, return null
        if(node ==null)
            return null;
        
        // Queue for bfs
        Queue<Node> q = new LinkedList<>();
        //map which contains <Original Node, New node for copied graph>
        HashMap<Node,Node> map = new HashMap<>();
        
        q.add(node);
        // the new node only contains the value but none of the original's neighbor right now.
        map.put(node,new Node(node.val));
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            // loop through each neighbor of temp
            for(int x=0;x<temp.neighbors.size();x++)
            {
                // get the current neighbor
                Node curr = temp.neighbors.get(x);
                //if curr neighbor is already in graph, then we just have to add the neighbor array to it.
                if(!map.containsKey(curr))
                {
                    map.put(curr,new Node(curr.val));
                    q.add(curr);
                }
                //eg: for key 1, i get new Node of 1. for the new node, i access it neighbor list and add the current node to it
                map.get(temp).neighbors.add(map.get(curr));
            }
        }
        //return the value of origian node
        return map.get(node);
    }
    
    
}

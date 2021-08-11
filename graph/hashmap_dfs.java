import java.util.*;
class Graph
{
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    HashMap<Integer,Boolean> visited = new HashMap<>();
    
    public void addVertex(int source, int destination)
    {
        if(!map.containsKey(source))
        {
            map.put(source,new ArrayList<>());
            visited.put(source,false);
        }
        if(!map.containsKey(destination))
        {
            map.put(destination,new ArrayList<>());
            visited.put(destination,false);
        }
        
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    
    public void print()
    {
        for(int node : map.keySet())
        {
            System.out.println(node+" -> "+map.get(node));
        }
    }
    
    public void dfs(int startNode)
    {
        if(visited.get(startNode) == true)
        {
            return;
        }
        else
        {
            int n = map.get(startNode).size();
            System.out.println(startNode);
            visited.put(startNode,true);
            for(int x=0;x<n;x++)
            {
                dfs(map.get(startNode).get(x));
            }
        }
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Graph graph = new Graph();
		graph.addVertex(5,4);
		graph.addVertex(5,8);
		graph.addVertex(4,8);
		graph.addVertex(8,2);
		graph.print();
		graph.dfs(4);
		
	}
}

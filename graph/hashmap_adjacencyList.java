import java.util.*;
class Graph
{
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    public void addVertex(int source, int destination)
    {
        if(!map.containsKey(source))
        {
            map.put(source,new ArrayList<>());
        }
        if(!map.containsKey(destination))
        {
            map.put(destination,new ArrayList<>());
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
		
	}
}

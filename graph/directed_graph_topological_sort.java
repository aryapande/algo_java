import java.util.*;
class Graph
{
    
    LinkedList<Integer> adj[];
    int V;
    Graph(int size)
    {
        V = size;
        adj = new LinkedList[size];
        for(int x=0;x<size;x++)
        {
            adj[x] = new LinkedList<>();
        }
    }
    
    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
    }
    
    public void topologicalSort()
    {
        boolean visited[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        
        for(int x=0;x<V;x++)
        {
            if(!visited[x])
            {
                top_dfs(x,visited,s);
            }
        }
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    
    public void top_dfs(int node, boolean visited[], Stack<Integer> s)
    {
        visited[node] = true;
        Integer index;
        Iterator<Integer> i = adj[node].iterator();
        
        while(i.hasNext())
        {
            index = i.next();
            if(visited[index] == false)
            {
                top_dfs(index,visited, s);
            }
        }
        s.push(node);
    }
}


public class Main
{
	public static void main(String[] args) {
		
		Graph graph = new Graph(7);
		graph.addEdge(0,1);
		graph.addEdge(2,1);
		graph.addEdge(2,3);
		graph.addEdge(3,4);
		graph.addEdge(1,4);
		graph.addEdge(5,4);
		graph.addEdge(4,6);
		
		graph.topologicalSort();
	}
}

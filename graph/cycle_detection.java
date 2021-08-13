// if node is already visited and it is part of recursion stack then cycle is detected

import java.util.*;
class Graph
{
    int V;
    LinkedList<Integer> adj[];
    Graph(int size)
    {
        V = size;
        adj = new LinkedList[V];
        for(int x=0;x<V;x++)
            adj[x] = new LinkedList();
    }
    
    public void addEdge(int s,int d)
    {
        adj[s].add(d);
    }
    
    public boolean isCyclic(int startNode)
    {
        boolean vis[] = new boolean[V];
        boolean s[] = new boolean[V];
        
        for(int x=0;x<V;x++)
        {
            if(isCyclicUtil(vis,s, x))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isCyclicUtil(boolean vis[], boolean s[], int node)
    {
        if(s[node] == true)
        {
            return true;
        }
        if(vis[node])
        {
            return false;
        }
        
        vis[node] = true;
        s[node] = true;
        
        Iterator<Integer> i = adj[node].iterator();
        Integer index;
        while(i.hasNext())
        {
            index = i.next();
            if(isCyclicUtil(vis,s,index))
                return true;
            
        }
        s[node] = false;
        return false;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Graph g = new Graph(5);
		g.addEdge(1,2);
		g.addEdge(2,4);
		g.addEdge(4,3);
		g.addEdge(2,3);
		g.addEdge(3,1);
		
		System.out.println(g.isCyclic(1));
		
	}
}

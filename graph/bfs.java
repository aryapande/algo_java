import java.util.*;
class Graph
{
    LinkedList<Integer> adj[];
    int V;
    Graph(int size_of_list)
    {
        V = size_of_list;
        adj = new LinkedList[V];
        for(int x=0;x<V;x++)
        {
            adj[x] = new LinkedList();
        }
    }
    
    public void addVertex(int source,int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }
    
    public void print()
    {
        for(int x=0;x<V;x++)
        {
            System.out.print(x+" -> ");
            Iterator i = adj[x].iterator();
            while(i.hasNext())
            {
                System.out.print(i.next()+",");
            }
            System.out.println();
        }
    }
    
    public boolean question_util_dfs()
    {
        boolean visited[] = new boolean[V];
        //defaul val is false
        for(int x=0;x<V;x++)
        {
            if(visited[x]==false)
            {
                // -1 is parent
                if(isCycle(x,visited, -1) == true)
                    return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int node, boolean visited[], int parent)
    {
        visited[node] = true;
        Iterator<Integer> i = adj[node].iterator();
        Integer index;
        while(i.hasNext())
        {
            index = i.next();
            if(visited[index] == false)
            {
                if(isCycle(index,visited,node))
                    return true;
            }
            else if(index!=parent)
                return true;
        }
        return false;
    }
    
    public void bfs(int startNode)
    {
        Queue<Integer> q = new LinkedList<>();
        
        boolean visited[] = new boolean[V];
        
        q.add(startNode);
        visited[startNode] = true;
        int node;
        
        while(!q.isEmpty())
        {   
            
            node = q.poll();
            System.out.println(node);
            Iterator<Integer> i = adj[node].iterator();
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
            
        }
    }
    
}


public class Main
{
	public static void main(String[] args) {
		
		Graph graph = new Graph(5);
		graph.addVertex(0,1);
		graph.addVertex(1,2);
		graph.addVertex(1,3);
		graph.addVertex(0,4);
		graph.addVertex(3,2);
		
		
		graph.print();
		//System.out.println(graph.question_util_dfs());
		graph.bfs(1);
		//int count = graph.countConnected();
		//System.out.println("Total amount of disconnected entities = "+count);
	}
}

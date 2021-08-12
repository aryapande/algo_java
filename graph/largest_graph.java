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
    int lol=1;
    public int countLargest()
    {
        int max = -1;
        boolean visited[] = new boolean[V];
        
        for(int x=0;x<V;x++)
        {
            if(!visited[x])
            {
                dfs(visited,x);
                max = Math.max(max,lol);
                lol = 1;
            }
        }
        
        return max;
    }
    
    public void dfs(boolean visited[], int node)
    {
        Iterator<Integer> i = adj[node].iterator();
        visited[node] = true;
        
        Integer index;
        while(i.hasNext())
        {
            index = i.next();
            if(!visited[index])
            {
                lol++;
                dfs(visited,index);
            }
        }
        
        
    }
    
}


public class Main
{
	public static void main(String[] args) {
		
		Graph graph = new Graph(8);
		graph.addVertex(0,1);
		graph.addVertex(1,2);
		graph.addVertex(1,3);
		graph.addVertex(0,4);
		graph.addVertex(3,2);
		
		graph.addVertex(5,6);
		graph.addVertex(6,7);
		graph.print();
		//System.out.println(graph.question_util_dfs());
		System.out.println(graph.countLargest());
		//int count = graph.countConnected();
		//System.out.println("Total amount of disconnected entities = "+count);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int n = 3;
		// initializing with a size of 3, thats why (n)
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
		for(int x=0;x<n;x++)
		{
		    adj.add(new ArrayList<Integer>());
		}
		
		graph obj = new graph();
		obj.addEdge(adj, 0, 1);
		//obj.addEdge(adj, 0, 2);
		obj.addEdge(adj, 1, 2);

		obj.print(adj);
	}
	
	static class graph
	{
	    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u, int v)
	    {
	        adj.get(u).add(v);
	        adj.get(v).add(u);
	    }
	    
	    static void print(ArrayList<ArrayList<Integer>> adj)
	    {
	        for(int x=0; x<adj.size() ; x++)
	        {
	            System.out.print(x+" is connected to ");
	            for(int y=0; y<adj.get(x).size(); y++)
	            {
	                System.out.print(adj.get(x).get(y)+", ");
	            }
	            System.out.println();
	            
	        }
	    }
	}
}

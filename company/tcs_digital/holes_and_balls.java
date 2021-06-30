//https://www.geeksforgeeks.org/tcs-codevita-holes-and-balls/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[] = {20, 15, 10, 5, 25};
	    int b[] = {5, 10, 15, 20, 25, 30, 4, 9, 14, 19};
	    help(a,b);
		
	}
	
	public static void help(int h[],int b[])
	{
	    int res[] = new int[b.length];
	    int depth[] = new int[h.length];
	    
	    for(int x=1;x<=h.length;x++)
	    {
	        depth[x-1] = x;
	    }
	    
	    // if ball gets in hole depth decreases
	    // f=false means that ball is still on slope
	    int f=0;
	    for(int x=0;x<b.length;x++)
	    {
	        f = 0;
	        for(int y=h.length-1;y>=0;y--)
	        {
	            
	            if(b[x]<=h[y] && depth[y]>0)
	            {
	                
	                depth[y]--;
	                res[x] = y+1;
	                
	                break;
	            }
	            else if(b[x]<=h[y] && depth[y]<1)
	            {
	                f ++;
	            }
	            else
	            {
	                f++;
	            }
	            
	        }
	        if(f==h.length)
	        {
	            res[x]=0;
	        }
	    }
	    System.out.println(Arrays.toString(res));
	}
}

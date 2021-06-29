import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[] = {1,3,0,0,1,2,4};
		Stack<Integer> s = new Stack<>();
		int op[] = new int[a.length];
		for(int x = a.length-1 ; x>=0 ; x--)
		{
		    //initial check for last digit in array would ofc be -1
		    if(s.isEmpty()==true)
		    {
		        op[x] = -1;
		        s.push(a[x]);
		    }
		    else
		    {
		        //check if element in stack is bigger than current element, if yes then add in op
		        if(s.peek()>a[x])
		        {
		            op[x] = s.peek();
		            s.push(a[x]);
		            continue;
		        }
		        else
		        {
		            //keep on checking for the next biggest element in stack, if not, do -1 at end
		            while(s.isEmpty()==false)
		            {
		                if(s.peek()<a[x])
		                {
		                    s.pop();
		                }
		                else
		                {
		                    op[x] = s.peek();
		                    s.push(a[x]);
		                    break;
		                }
		            }
		            if(s.isEmpty())
		            {
		                op[x] = -1;
		                s.push(a[x]);
		                continue;
		            }
		                
		        }
		    }
		}
		System.out.println(Arrays.toString(op));
	}
}

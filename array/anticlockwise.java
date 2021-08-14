public class Main
{
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		print(a);
		rotate_clock(a);
		print(a);
	}
	
	public static void print(int a[][])
	{
	    for(int x=0;x<a.length;x++)
	    {
	        for(int y = 0; y<a[x].length;y++)
	            System.out.print(a[x][y]+" ");
	        System.out.println();
	    }
	}
	
	public static void rotate_clock(int a[][])
	{
	    //transpose from primary diagonal
	    for(int x=0;x<a.length;x++)
	    {
	        for(int y = x; y<a[x].length;y++)
	            {
	                swap(x,y,a);
	            }
	            System.out.println();
	            
	    }
	    
	    // now flip vertically
	    int i=0;
	    int j=a.length-1;
	    int temp;
	    while(i<j)
	    {
	        for(int x=0;x<a.length;x++)
	        {
	            temp = a[i][x];
	            a[i][x] = a[j][x];
	            a[j][x] = temp;
	        }
	        i++;
	        j--;
	    }
	}
	
	public static void swap(int x, int y, int arr[][])
	{
	    //System.out.println("fdsf:"+x+" sad "+y);
	    int temp = arr[x][y];
	    arr[x][y] = arr[y][x];
	    arr[y][x] = temp;
	}
}

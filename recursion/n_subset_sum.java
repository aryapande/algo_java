class HelloWorld {
    public static void main(String[] args) {
        int a[] = {1,2,5,7,4};
        int t = 9;
        int b = help(a,t,a.length);
        System.out.println(b);
    }
    
    public static int help(int arr[], int t, int i)
    {
        if(t==0)
        {
            return 1;
        }
        if(i==0)
        {
            
            return 0;
        }
        if(t-arr[i-1]>=0)
        {
            return help(arr,t-arr[i-1],i-1) + help(arr,t,i-1);
        }
        else
        {   System.out.println(arr[i-1]+" "+t);
            return help(arr,t,i-1);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        //largest palindromic substring, ans = 7 
        //A,B,C matrices
        int arr[] = {20,20,30,10};
        int n = arr.length;
        
        System.out.println(help(arr,1,n-1));
    }
    
    public static int help(int arr[], int i, int j)
    {
        if(i>j)
            return 0;
        if(i==j)// meaing matrix is only 1 
            return 0;
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1 ; k++)
        {
            int temp = help(arr,i,k) + help(arr,k+1,j) + (arr[i-1]*arr[j]*arr[k]);
            ans = Math.min(ans,temp);
        }
      return ans;
        
    }
}

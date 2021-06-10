import java.util.Arrays;
class HelloWorld {
    
    public static void main(String[] args) {
        //print all triplets with sum = 0
        int a[] = {1,5,3,-2,-4,-1,0};
        int n = a.length;
        Arrays.sort(a);
        System.out.println(a);
        for(int x = 0;x<n;x++)
        {
            int l = x+1;
            int r = n-1;
            int lol = a[x];
            
            while(l<r)
            {
               
                if((lol+a[l]+a[r])==0)
                {
                    System.out.println();
                    System.out.print(lol+","+a[l]+","+a[r]);
                    System.out.println();
                    break;
                }
                else if((lol+a[l]+a[r])<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
                
            }
        }
    }
}

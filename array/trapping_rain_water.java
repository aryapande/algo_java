class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<3)
        {
            return 0;
        }
        int maxLeft[] = new int[n];
        int m = 0;
        for(int x=0;x<n;x++)
        {
            if(height[x]>m)
            {
                m = height[x];
            }
            maxLeft[x] = m;
        }
        
        
        int maxRight[] = new int[n];
        m = 0;
        for(int x = n-1; x >=0 ; x--)
        {
            maxRight[x] = m;
            if(height[x]>m)
            {
                m = height[x];
            }
            
        }
        //System.out.println(Arrays.toString(maxLeft));
        //System.out.println(Arrays.toString(maxRight));
        
        // now go across each index
        int s = 0;
        int curr;
        for(int x=1;x<(n-1);x++)
        {
            curr = Math.min(maxLeft[x],maxRight[x]) - height[x];
            if(curr<=0)
                continue;
            s+= curr; 
        }
        return s;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int m=4;
        int n=3;
        int arr[][] = new int[m][n];
        int top = 0;
        int left = 0;
        int right = n-1;
        int down = m-1;
        int count = 1;
        int dir = 0;
        
        while(top<=down && left<=right)
        {
            System.out.println(dir);
            System.out.println();
            if(dir == 0)
            {
                for(int x=left;x<=right;x++)
                {
                    arr[top][x] = count++;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int x=top;x<=down;x++)
                {
                    arr[x][right] = count++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int x=right;x>=left;x--)
                {
                    arr[down][x] = count++;
                }
                down--;
            }
            else if(dir==3)
            {
                for(int x=down;x>=top;x--)
                {
                    arr[x][left] = count++;
                }
                left++;
            }
            dir = (dir+1)%4;
            
        }
        
        for(int x=0;x<m;x++)
        {
            for(int y=0; y<n ;y++)
                System.out.print(arr[x][y]+" ");
            System.out.println();
        }
    }
}

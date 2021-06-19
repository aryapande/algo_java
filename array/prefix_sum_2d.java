//rectangle sum from row1 to row2 and col1 to col2 over multiple queries
class NumMatrix {
    int rl;
    int cl;
    
    int prefix[][];
    public NumMatrix(int[][] matrix) {
        
        rl = matrix[0].length;
        cl = matrix.length;
        prefix = matrix;
        System.out.println("rl:" +rl);
        System.out.println("cl:" +cl);
        int sum = 0;
        for(int x=0;x<cl;x++)
        {
            sum = 0;
            for(int y = 0; y<rl;y++)
            {
                sum += prefix[x][y];
                prefix[x][y] = sum;
            }
            System.out.println(Arrays.toString(prefix[x]));
        }
        
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int x=row1; x<=row2; x++)
        {
            sum += prefix_sum(col2,col1,x);
            //System.out.println("x:" + sum);
        }
        //System.out.println("returning:" + sum);
        return sum;
    }
    public int prefix_sum(int col2, int col1,int row)
    {
        if(col1 == 0)
        {
            return prefix[row][col2];
        }
        else
        {
            return prefix[row][col2] - prefix[row][col1-1];
        }
    }
}

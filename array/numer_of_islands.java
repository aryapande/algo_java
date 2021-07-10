import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 0, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 0, 0, 0, 0, 0 },
                                  { 1, 0, 1, 0, 1 } };
        System.out.println(island(M, M.length,M[0].length ));
                                  
        
    }
    
    static int island(int a[][], int ROW, int COL)
    {
        int count = 0;
        for(int i=0;i<ROW;i++)
        {
            for(int j = 0; j<COL;j++)
            {
                //System.out.println(i+" "+j);
                if(a[i][j]==1)
                {
                    a[i][j] = 0;
                    count++;
                    
                    DFS(a, i + 1, j, ROW, COL);     //right side traversal
                    DFS(a, i - 1, j, ROW, COL);     //left side traversal
                    DFS(a, i, j + 1, ROW, COL);     //upward side traversal
                    DFS(a, i, j - 1, ROW, COL);     //downward side traversal
                    DFS(a, i + 1, j + 1, ROW, COL); //upward-right side traversal
                    DFS(a, i - 1, j - 1, ROW, COL); //downward-left side traversal
                    DFS(a, i + 1, j - 1, ROW, COL); //downward-right side traversal
                    DFS(a, i - 1, j + 1, ROW, COL); //upward-left side traversal
                }
                
                
            }
        }
        return count;
        
    }
    static void DFS(int a[][], int i,int j , int ROW, int COL)
    {
        if(i>=ROW || j>=COL || i<0 || j<0)
            return;
        
        if(a[i][j]==1)
        {
            a[i][j] = 0;
            DFS(a, i + 1, j, ROW, COL);     //right side traversal
            DFS(a, i - 1, j, ROW, COL);     //left side traversal
            DFS(a, i, j + 1, ROW, COL);     //upward side traversal
            DFS(a, i, j - 1, ROW, COL);     //downward side traversal
            DFS(a, i + 1, j + 1, ROW, COL); //upward-right side traversal
            DFS(a, i - 1, j - 1, ROW, COL); //downward-left side traversal
            DFS(a, i + 1, j - 1, ROW, COL); //downward-right side traversal
            DFS(a, i - 1, j + 1, ROW, COL); //upward
        }
        else
            return;
    }
}

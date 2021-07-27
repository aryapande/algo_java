//https://leetcode.com/problems/number-of-provinces/
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean vis[] = new boolean[isConnected.length];
        int c=0;
        for(int x=0;x<isConnected.length;x++)
        {
            if(vis[x]== false)
            {
                c++;
                bfs(vis,isConnected,x);
            }
        }
        return c;
    }
    public void bfs(boolean vis[], int arr[][], int id)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        while(!q.isEmpty())
        {
            int i = q.poll();
            vis[i] = true;
            for(int x=0;x<arr.length;x++)
            {
                if(arr[i][x] == 1 && vis[x] == false)
                {
                    q.add(x);
                }
            }
        }
    }
}

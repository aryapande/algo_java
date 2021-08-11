public int countConnected()
    {
        int count = 0;
        for(int node : visited.keySet())
        {
            if(visited.get(node) == false)
            {
                System.out.println("starting node = "+node);
                count++;
                dfs(node);
            }
        }
        return count;
    }

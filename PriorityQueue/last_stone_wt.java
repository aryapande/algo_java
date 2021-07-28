class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int x=0;x<stones.length;x++)
        {
            q.add(stones[x]);
        }
        int m,n;
        while(q.size()>1)
        {
            m = q.poll();
            n = q.poll();
            //System.out.println(m+","+n);
            if(m==n)
                continue;
            else if(m>n)
                q.add(m-n);
            else
                q.add(n-m);
            
        }
        System.out.print(q);
        Iterator i = q.iterator();
        while(i.hasNext())
        {
            return ((int)i.next());
        }
        return 0;
    }
}

class Solution {
  //https://leetcode.com/problems/top-k-frequent-elements/
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n[] = new int[k];
        for(int x=0;x<nums.length;x++)
        {
            if(map.containsKey(nums[x]))
                map.put(nums[x],map.get(nums[x])+1);
            else
            {
                map.put(nums[x],1);
            }
        }
        //System.out.println(map);
        PriorityQueue<Integer> q= new PriorityQueue<Integer>((n1,n2) -> map.get(n2)-map.get(n1));
        for(int key : map.keySet())
        {
            q.add(key);
        }
        int id = 0;
        while(q.size()>0 && id<k)
        {
            
            n[id++] = q.poll();
        }
        
        return n;
    }
}

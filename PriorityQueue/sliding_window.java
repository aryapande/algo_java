//https://leetcode.com/problems/sliding-window-maximum/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int x=0;x<k;x++)
        {
            q.add(nums[x]);
        }
        int ret[] = new int[nums.length-k+1];
        int ret_index = 0;
        ret[ret_index++] = q.peek();
        
        if(k == nums.length)
        {
            return ret;
        }
        
        for(int x = k; x<nums.length;x++)
        {
            q.remove(nums[x-k]);
            q.add(nums[x]);
            ret[ret_index++] = q.peek();
        }
        return ret;
    }
}

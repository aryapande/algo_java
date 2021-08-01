//https://leetcode.com/problems/average-of-levels-in-binary-tree/
class Solution {
    
    List<Double> arr = new ArrayList<>();
    ArrayList<Integer> n = new ArrayList<>();
    
    public List<Double> averageOfLevels(TreeNode root) {
        help(root,0);
        for(int x=0;x<n.size();x++)
        {
            arr.set(x,(arr.get(x) / n.get(x)));
        }
        return arr;
    }
    
    public void help(TreeNode root, int level)
    {
        if(root==null)
            return;
        if(level<arr.size())
        {
            // if level is already in arr
            arr.set(level,arr.get(level)+root.val);
            n.set(level, n.get(level)+1);
        }
        else
        {
            arr.add(1.0*root.val);
            n.add(1);
        }
        
        
        help(root.left,level+1);
        help(root.right,level+1);
        
    }
}

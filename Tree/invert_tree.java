class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        inv(root);
        return root;
    }
    public void inv(TreeNode root)
    {
        if(root.left == null && root.right == null)
            return;
        
        if(root.left!=null && root.right ==null)
        {
            root.right = root.left;
            root.left = null;
            
        }
        else if(root.right !=null && root.left == null)
        {
            root.left = root.right;
            root.right = null;
        }
        else
        {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
        
        if(root.left!=null)
            inv(root.left);
        if(root.right!=null)
            inv(root.right);
        
    }
}

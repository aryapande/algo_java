import java.util.*;
class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        left = null;
        right = null;
        this.val = val;
    }
}
class HelloWorld {
    static int max_level = -1;
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(6);
        root.right.right.left = new Node(7);
        leftview(root,0);
        System.out.println(arr);
        
        
    }
    
    public static void leftview(Node root,int level)
    {
        if(root==null)
            return ;
        if(level>max_level)
        {
            arr.add(root.val);
            max_level = level;
        }
        if(root.left!=null)
            leftview(root.left,level+1);
        if(root.right!=null)
            leftview(root.right,level+1);
    }
}

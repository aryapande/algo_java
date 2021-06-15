class Node
{
    int val;
    Node left,right;
    Node(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Node tree = new Node(5);
        tree.left = new Node(4);
        tree.right = new Node(6);
        tree.right.right = new Node(8);
        tree.right.right.left = new Node(78);
        
        int h = height(tree);
        System.out.println(h);
        
    }
    
    public static int height(Node n)
    {
        if(n == null)
        {
            return 0;
        }
        else
        {
            return 1+Math.max(height(n.left),height(n.right));
        }
    }
    public static void print(Node n)
    {
        if(n==null)
        {
            return;
        }
        else
        {
            System.out.println(n.val);
            print(n.left);
            print(n.right);
        }
    }
    
}

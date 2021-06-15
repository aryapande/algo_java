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
        print(tree);
        
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
            print(n.right);
            print(n.left);
        }
    }
    
}

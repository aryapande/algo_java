import java.util.*;
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTree {
 
    Node root;
 
    void printLevelOrder()
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty())
        {
 
            //poll() removes the present head.
            
            Node tempNode = q.poll();
            System.out.print(tempNode.data + " ");
 
            /*Enqueue left child */
            if (tempNode.left != null) {
                q.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversalof binary tree is - ");
        tree_level.printLevelOrder();
	}
}

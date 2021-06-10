class LinkedList
{
    Node head;
    
    class Node
    {
        Node next;
        int val;
        Node(int v)
        {
            v = 0;
            next = null;
        }
    }
    
    public void insert(int v)
    {
        Node newnode = new Node(v);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
    
}





class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(3);
        l.print();
    }
}

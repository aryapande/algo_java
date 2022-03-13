class HelloWorld {
    public static void main(String[] args) {
       
        LL obj = new LL();
        obj.insertEnd(6);
        obj.insertEnd(5);
        obj.insertStart(53);
        obj.insertEnd(5);
        obj.print();
        
        obj.deleteStart();
        obj.print();
        obj.deleteEnd();
        obj.print();
        
    }
}
class LL
{
    Node head;
    
    class Node
    {
        Node next;
        int val;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    void insertEnd(int v)
    {
        Node temp = head;
        Node newNode = new Node(v);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void insertStart(int v)
    {
        Node newNode = new Node(v);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteStart()
    {
        if(head != null)
        {
            head= head.next;
        }
    }
    void deleteEnd()
    {
        if(head!=null)
        {
            Node temp = head;
            Node tempPrev = null;
            while(temp.next!=null)
            {
                tempPrev = temp;
                temp = temp.next;
                
            }
            tempPrev.next = null;
            temp = null;
        }
    }
}

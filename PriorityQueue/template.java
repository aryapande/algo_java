import java.util.*;
class HelloWorld {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> p= new PriorityQueue<>();
        // PriorityQueue<Integer> p= new PriorityQueue<>(Collections.reverseOrder());
        
        p.add(30);
        p.add(56);
        p.add(3);
        for(int x:p)
        {   
            System.out.println();
            System.out.println(x);
            System.out.println();
        }
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
        
        
    }
}

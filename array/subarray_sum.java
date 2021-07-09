import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int sum = 7;
        int arr[] = {3,4,2,-3,1,4,2,5,8,1,1};
        
        int prefix[] = new int[arr.length];
        int curr = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 0;
        
        for(int x=0;x<arr.length;x++)
        {
            curr = curr + arr[x];
            if(curr == sum)
            {
                count++;
                System.out.println("from: 0 to "+x);
            }
            if(m.containsKey(curr - sum))
            {
                count++;
                System.out.println("from:"+ (m.get(curr-sum)+1) +"to "+x);
            }
            m.put(curr,x);
            
        }
        System.out.println("Total amt  of times the sum is found = "+count);
    }
}

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int arr[] = {14,3,6,8,11,16};
        int n =6;
        Arrays.sort(arr);
        int left,right;
        int count = 0;
        int sum = 0;
        for(int x=0;x<n;x++)
        {
            left = 0;
            right = n-1;
            //System.out.println("value of x:" +x);
            while(left<right)
            {
                sum = arr[left] + arr[right];
                //System.out.println("left="+left+" right="+right);    
                if(sum == arr[x])
                {
                    //System.out.println("fount at;"+"left="+left+" right="+right); 
                    count++;
                    //System.out.println("count val:" +count); 
                    left++;
                    right--;
                    
                }
                if(sum>arr[x])
                    right--;
                else if(sum<arr[x])
                    left++;
                
            }
        }
    }
}

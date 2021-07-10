import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
 
        
        sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sort(int arr[], int l, int h)
    {
        int mid = (l+h)/2;
        if(l<h)
        {
        sort(arr,l,mid);
        sort(arr,mid+1,h);
        merge(arr,l,mid,h);
        }
    }
    
    public static void merge(int arr[], int l, int mid ,int h)
    {
        System.out.println("mid: "+mid);
        int n1 = mid-l+1;
        int n2 = h-mid;
        
        int first[] = new int[n1];
        int second[] = new int[n2];
        
        for(int x=0;x<n1;x++)
        {
            first[x] = arr[l+x];
        }
        for(int x=0;x<n2;x++)
        {
            second[x] = arr[mid+x+1];
        }
        
        int i=0,j=0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(first[i]<=second[j])
            {
                arr[k] = first[i]; 
                i++;
            }
            else
            {
                arr[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k++] = first[i++];
        }
        while(j<n2)
        {
            arr[k++] = second[j++];
        }
    }
}

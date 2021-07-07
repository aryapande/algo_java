import java.util.*;

class Activity 
    {
        int start, finish;
        public Activity(int s, int f)
          {
            start = s;
            finish = f;
          }
    }
    
class check implements Comparator<Activity>
    {
        public int compare(Activity a, Activity b)
        {
            return a.finish-b.finish;
        }
    }


class HelloWorld {
    public static void main(String[] args) 
    {
        int start[] = {12,10,20,5};
        int end[] = {25,20,30,11};
        Activity a[] = new Activity[end.length];
        for(int x=0;x<end.length;x++)
        {
            a[x] = new Activity(start[x],end[x]);
        }
        
        Arrays.sort(a,new check());
        //System.out.println(a[0].start);
        
        // The first activity always gets selected
    int i = 0;
    System.out.print("(" + a[i].start + ", "
                     + a[i].finish + "), ");
  
    // Consider rest of the activities
    for (int j = 1; j < end.length; j++) 
    {
      if (a[j].start >= a[i].finish)
      {
        System.out.print("(" + a[j].start + ", "
                         + a[j].finish + "), ");
        i = j;
      }
    }
}
}

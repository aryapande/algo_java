import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s1 = "arya";
        String s2 = "aryb";
        int a = help(s1,s2,s1.length()-1,s2.length()-1);
        System.out.println(a);
    }
    
    public static int help(String s1,String s2,int m,int n)
    {
        if(m==0)
            return n;
        if(n==0)
            return m;
        char c1 = s1.charAt(m);
        char c2 = s2.charAt(n);
        
        if(c1==c2)
            return help(s1,s2,m-1,n-1);
        else
        {
            return Math.min(1+help(s1,s2,m,n-1), Math.min(1+help(s1,s2,m,n-1),1+help(s1,s2,m-1,n-1)) );
        }
        
    }
}

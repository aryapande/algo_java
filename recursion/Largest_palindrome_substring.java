class HelloWorld {
    public static void main(String[] args) {
        //largest palindromic substring, ans = 7 
        String a = "dvcagbcbad";
        int m = a.length();
        String b = "";
        for(int x = 0; x<m;x++)
        {
            b = a.charAt(x)+b; 
        }
        int n = m;
        
        System.out.println(help(a,b,m-1,n-1));
    }
    
    public static int help(String a, String b, int m , int n)
    {
        
        if(m==-1 || n == -1)
            return 0;
        
        if(a.charAt(m) == b.charAt(n))
        {
            return 1 + help(a,b,m-1,n-1);
        }
        else
        {
            return Math.max(help(a,b,m-1,n) , help(a,b,m,n-1));
        }
        
    }
}
